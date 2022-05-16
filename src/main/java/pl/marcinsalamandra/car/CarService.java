package pl.marcinsalamandra.car;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.marcinsalamandra.advertisement.request.PostAdvertisementRequest;
import pl.marcinsalamandra.carmodel.CarModel;
import pl.marcinsalamandra.carmodel.CarModelRepository;
import pl.marcinsalamandra.parameters.Parameters;
import pl.marcinsalamandra.parameters.ParametersRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarModelRepository carModelRepository;
    private final ParametersRepository parametersRepository;

    @Transactional
    public Car saveCar(PostAdvertisementRequest request) {
        Parameters parameters = new Parameters(
                request.getColor(),
                request.getVintage(),
                request.getMileage(),
                request.getPower(),
                request.getFuel()
        );
        parametersRepository.save(parameters);

        CarModel carModel = carModelRepository.
                findByModelName(request.getModelName()).get();

        Car car = new Car(parameters, carModel);
        return carRepository.save(car);
    }
}
