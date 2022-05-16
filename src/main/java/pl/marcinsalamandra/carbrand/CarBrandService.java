package pl.marcinsalamandra.carbrand;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Service
@AllArgsConstructor
public class CarBrandService {
    private final CarBrandRepository carBrandRepository;

    public ResponseEntity<?> findAllBrands() {
        List<CarBrand> brands = carBrandRepository.findAll();

        return ResponseEntity
                .status(OK)
                .body(brands);
    }
}

