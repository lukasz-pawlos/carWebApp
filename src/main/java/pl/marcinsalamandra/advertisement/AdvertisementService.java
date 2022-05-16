package pl.marcinsalamandra.advertisement;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.marcinsalamandra.advertisement.request.BuyAdvertisementRequest;
import pl.marcinsalamandra.advertisement.request.PostAdvertisementRequest;
import pl.marcinsalamandra.advertisement.response.AdvertisementResponse;
import pl.marcinsalamandra.car.Car;
import pl.marcinsalamandra.car.CarService;
import pl.marcinsalamandra.email.AdvertisementEmailService;
import pl.marcinsalamandra.exception.AdvertNotFoundException;
import pl.marcinsalamandra.mapper.Mapper;
import pl.marcinsalamandra.parameters.Parameters;
import pl.marcinsalamandra.util.PhoneNumberSplitter;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.http.HttpStatus.*;

@Service
@AllArgsConstructor
public class AdvertisementService {

    private final AdvertisementRepository advertisementRepository;
    private final CarService carService;
    private final Mapper mapper;
    private final AdvertisementEmailService advertisementEmailService;
    private final PhoneNumberSplitter phoneNumberSplitter;

    public ResponseEntity<?> findByFilters(
            Integer priceMin,
            Integer priceMax,
            Integer powerMin,
            Integer powerMax,
            Integer vintageMin,
            Integer vintageMax,
            Integer mileageMin,
            Integer mileageMax,
            String modelName,
            String fuel) {

        List<Advertisement> adverts = advertisementRepository.findByFilters(
                priceMin,
                priceMax,
                powerMin,
                powerMax,
                vintageMin,
                vintageMax,
                mileageMin,
                mileageMax,
                modelName,
                fuel
        );

        List<AdvertisementResponse> responses = mapper.createAdvertisementResponses(adverts);

        return ResponseEntity
                .status(OK)
                .body(responses);
    }

    public ResponseEntity<?> findBySecretKey(String secretKey) {
        Optional<Advertisement> advertFromDb = advertisementRepository.findBySecretKey(secretKey);

        if(!advertFromDb.isPresent()) {
            throw new AdvertNotFoundException("advertisement not found");
        }

        Advertisement advert = advertFromDb.get();
        AdvertisementResponse response = mapper.createAdvertisementResponse(advert);

        return ResponseEntity
                .status(OK)
                .body(response);
    }

    @Transactional
    public ResponseEntity<?> postAdvert(PostAdvertisementRequest request) {
        Car car = carService.saveCar(request);

        Advertisement advert = new Advertisement(
                request.getDescription(),
                request.getTitle(),
                request.getPrice(),
                request.getEmail(),
                phoneNumberSplitter.splitPhoneNumber(request.getPhone()),
                UUID.randomUUID().toString(),
                car
        );
        advertisementRepository.save(advert);
        advertisementEmailService.sendEmailAfterPostingAdvert(
                request.getEmail(),
                advert.getSecretKey()
        );

        return ResponseEntity
                .status(CREATED)
                .body("advertisement has been posted");
    }

    @Transactional
    public ResponseEntity<?> buyCar(String secretKey, BuyAdvertisementRequest request) {
        Optional<Advertisement> advertFromDb = advertisementRepository.findBySecretKey(secretKey);

        if(!advertFromDb.isPresent()) {
            throw new AdvertNotFoundException("advertisement not found");
        }

        Advertisement advert = advertFromDb.get();
        advertisementEmailService.sendEmailAfterBuying(
                advert.getEmail(),
                request.getBuyerEmail(),
                phoneNumberSplitter.splitPhoneNumber(request.getBuyerPhone()),
                secretKey
        );
        advertisementRepository.deleteBySecretKey(secretKey);

        return ResponseEntity
                .status(OK)
                .body("purchase completed, confirmation email has been sent to the car owner");
    }

    @Transactional
    public ResponseEntity<?> editAdvert(String secretKey, PostAdvertisementRequest request) {
        Optional<Advertisement> advertFromDb = advertisementRepository.findBySecretKey(secretKey);

        if(!advertFromDb.isPresent()) {
            throw new AdvertNotFoundException("advertisement not found");
        }

        Advertisement advert = advertFromDb.get();
        Parameters params = advert.getCar().getParameters();

        params.setColor(request.getColor());
        params.setVintage(request.getVintage());
        params.setMileage(request.getMileage());
        params.setPower(request.getPower());
        params.setFuel(request.getFuel());

        advert.setDescription(request.getDescription());
        advert.setTitle(request.getTitle());
        advert.setPrice(request.getPrice());
        advert.setEmail(request.getEmail());
        advert.setPhone(request.getPhone());

        advertisementRepository.save(advert);

        return ResponseEntity
                .status(OK)
                .body("advertisement has been edited");
    }

    @Transactional
    public ResponseEntity<?> deleteAdvertBySecretKey(String secretKey) {
        Optional<Advertisement> advertFromDb = advertisementRepository.findBySecretKey(secretKey);

        if(!advertFromDb.isPresent()) {
            throw new AdvertNotFoundException("advertisement not found");
        }

        advertisementRepository.deleteBySecretKey(secretKey);

        return ResponseEntity
                .status(OK)
                .body("advertisement has been deleted");
    }
}


