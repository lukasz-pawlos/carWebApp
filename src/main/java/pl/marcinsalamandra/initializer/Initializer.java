//package pl.marcinsalamandra.initializer;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Component;
//import pl.marcinsalamandra.carbrand.CarBrand;
//import pl.marcinsalamandra.carbrand.CarBrandRepository;
//import pl.marcinsalamandra.carmodel.CarModel;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//@Component
//@AllArgsConstructor
//public class Initializer {
//
//    private final CarBrandRepository carBrandRepository;
//
//    @PostConstruct
//    public void init() {
//        CarBrand carBrand1 = new CarBrand(
//                "Germany",
//                "Mercedes"
//        );
//
//        CarModel carModel1 = new CarModel(
//                "Coupe",
//                "CLA",
//                carBrand1
//        );
//
//        CarModel carModel2 = new CarModel(
//                "SUV",
//                "G-class",
//                carBrand1
//        );
//
//        carBrand1.setCarModels(List.of(carModel1, carModel2));
//        carBrandRepository.save(carBrand1);
//
//        CarBrand carBrand2 = new CarBrand(
//                "Italy",
//                "Ferrari"
//        );
//
//        CarModel carModel21 = new CarModel(
//                "Coupe",
//                "Italjia",
//                carBrand2
//        );
//
//        CarModel carModel22 = new CarModel(
//                "SUV",
//                "Passat-Ferrari",
//                carBrand2
//        );
//
//        carBrand2.setCarModels(List.of(carModel21, carModel22));
//        carBrandRepository.save(carBrand2);
//
//        CarBrand carBrand3 = new CarBrand(
//                "Germany",
//                "BMW"
//        );
//
//        CarModel carModel31 = new CarModel(
//                "Combi",
//                "E92",
//                carBrand3
//        );
//
//        CarModel carModel32 = new CarModel(
//                "Coupe",
//                "X5",
//                carBrand3
//        );
//
//        carBrand3.setCarModels(List.of(carModel31, carModel32));
//        carBrandRepository.save(carBrand3);
//
//        CarBrand carBrand4 = new CarBrand(
//                "Czech Republic",
//                "Skoda"
//        );
//
//        CarModel carModel41 = new CarModel(
//                "Coupe",
//                "Octavia",
//                carBrand4
//        );
//
//        CarModel carModel42 = new CarModel(
//                "Sedan",
//                "Superb",
//                carBrand4
//        );
//
//        carBrand4.setCarModels(List.of(carModel41, carModel42));
//        carBrandRepository.save(carBrand4);
//
//        CarBrand carBrand5 = new CarBrand(
//                "Japan",
//                "Mazda"
//        );
//
//        CarModel carModel51 = new CarModel(
//                "Coupe",
//                "RX7",
//                carBrand5
//        );
//
//        CarModel carModel52 = new CarModel(
//                "Coupe",
//                "RX8",
//                carBrand5
//        );
//
//        carBrand5.setCarModels(List.of(carModel51, carModel52));
//        carBrandRepository.save(carBrand5);
//    }
//}
