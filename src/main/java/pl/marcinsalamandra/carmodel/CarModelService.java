package pl.marcinsalamandra.carmodel;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@Service
@AllArgsConstructor
public class CarModelService {

    private final CarModelRepository carModelRepository;

    public ResponseEntity<?> findAllByBrandName(String brandName) {
        List<CarModel> models = carModelRepository.findAllByBrandName(brandName);

        return ResponseEntity
                .status(OK)
                .body(models);
    }
}

