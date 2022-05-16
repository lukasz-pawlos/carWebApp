package pl.marcinsalamandra.carmodel;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/models")
@AllArgsConstructor
public class CarModelController {

    private final CarModelService carModelService;

    @GetMapping("/{brandName}")
    public ResponseEntity<?> findAllByBrandName(
            @PathVariable("brandName") String brandName) {

        return carModelService.findAllByBrandName(brandName);
    }
}
