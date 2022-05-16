package pl.marcinsalamandra.car;

import lombok.*;
import pl.marcinsalamandra.carmodel.CarModel;
import pl.marcinsalamandra.parameters.Parameters;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "cars")
@Entity(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "parameters_id")
    private Parameters parameters;

    @OneToOne
    @JoinColumn(name = "car_model_id")
    private CarModel carModel;

    public Car(Parameters parameters,
               CarModel carModel) {
        this.parameters = parameters;
        this.carModel = carModel;
    }
}
