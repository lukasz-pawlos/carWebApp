package pl.marcinsalamandra.carbrand;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class CarBrandController {

    private final CarBrandService carBrandService;

    @GetMapping
    public ResponseEntity<?> findAllBrands() {
        return carBrandService.findAllBrands();
    }
}
