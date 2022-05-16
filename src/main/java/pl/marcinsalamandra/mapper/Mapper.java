package pl.marcinsalamandra.mapper;

import org.springframework.stereotype.Service;
import pl.marcinsalamandra.advertisement.Advertisement;
import pl.marcinsalamandra.advertisement.response.AdvertisementResponse;
import pl.marcinsalamandra.carbrand.CarBrand;
import pl.marcinsalamandra.carmodel.CarModel;
import pl.marcinsalamandra.parameters.Parameters;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapper {

    public List<AdvertisementResponse> createAdvertisementResponses(List<Advertisement> adverts) {
        List<AdvertisementResponse> responses = new ArrayList<>();

        for(Advertisement advert : adverts) {
            AdvertisementResponse response = createAdvertisementResponse(advert);
            responses.add(response);
        }
        return responses;
    }

    public AdvertisementResponse createAdvertisementResponse(Advertisement advert) {
        Parameters parameters = advert.getCar().getParameters();
        CarModel carModel = advert.getCar().getCarModel();
        CarBrand carBrand = carModel.getCarBrand();


        return new AdvertisementResponse(
                advert.getSecretKey(),
                parameters.getColor(),
                parameters.getVintage(),
                parameters.getMileage(),
                parameters.getPower(),
                parameters.getFuel(),
                carModel.getModelName(),
                carModel.getCarBody(),
                carBrand.getBrandName(),
                carBrand.getCountry(),
                advert.getDescription(),
                advert.getTitle(),
                advert.getPrice(),
                advert.getEmail(),
                advert.getPhone()
        );
    }
}
