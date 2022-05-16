package pl.marcinsalamandra.advertisement;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.marcinsalamandra.advertisement.request.BuyAdvertisementRequest;
import pl.marcinsalamandra.advertisement.request.PostAdvertisementRequest;

@RestController
@RequestMapping("/api/adverts")
@AllArgsConstructor
public class AdvertisementController {

    private final AdvertisementService advertisementService;
    private final String MIN = "0";
    private final String MAX = "" + Integer.MAX_VALUE;

    @GetMapping
    public ResponseEntity<?> findByFilters(
            @RequestParam(name = "price_min", defaultValue = MIN) Integer priceMin,
            @RequestParam(name = "price_max", defaultValue = MAX) Integer priceMax,
            @RequestParam(name = "power_min", defaultValue = MIN) Integer powerMin,
            @RequestParam(name = "power_max", defaultValue = MAX) Integer powerMax,
            @RequestParam(name = "vintage_min", defaultValue = MIN) Integer vintageMin,
            @RequestParam(name = "vintage_max", defaultValue = MAX) Integer vintageMax,
            @RequestParam(name = "mileage_min", defaultValue = MIN) Integer mileageMin,
            @RequestParam(name = "mileage_max", defaultValue = MAX) Integer mileageMax,
            @RequestParam(name = "model", defaultValue = "%") String modelName,
            @RequestParam(name = "fuel", defaultValue = "%") String fuel) {

        return advertisementService.findByFilters(
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
    }

    @GetMapping("/{secretKey}")
    public ResponseEntity<?> findBySecretKey(@PathVariable("secretKey") String secretKey) {
        return advertisementService.findBySecretKey(secretKey);
    }

    @PostMapping
    public ResponseEntity<?> postAdvert(@RequestBody PostAdvertisementRequest request) {
        return advertisementService.postAdvert(request);
    }

    @PostMapping("/{secretKey}")
    public ResponseEntity<?> buyCar(@PathVariable("secretKey") String secretKey,
                                    @RequestBody BuyAdvertisementRequest request) {
        return advertisementService.buyCar(secretKey, request);
    }

    @PutMapping("/{secretKey}")
    public ResponseEntity<?> editAdvert(@PathVariable("secretKey") String secretKey,
                                        @RequestBody PostAdvertisementRequest request) {
        return advertisementService.editAdvert(secretKey, request);
    }

    @DeleteMapping("/{secretKey}")
    public ResponseEntity<?> deleteAdvertBySecretKey(@PathVariable("secretKey") String secretKey) {
        return advertisementService.deleteAdvertBySecretKey(secretKey);
    }
}
