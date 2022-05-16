package pl.marcinsalamandra.carmodel;

import lombok.*;
import pl.marcinsalamandra.carbrand.CarBrand;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "car_models")
@Entity(name = "CarModel")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "car_body")
    private String carBody;

    @Column(name = "model_name")
    private String modelName;

    @ManyToOne
    @JoinColumn(name = "car_brand_id")
    private CarBrand carBrand;

    public CarModel(String carBody, String modelName, CarBrand carBrand) {
        this.carBody = carBody;
        this.modelName = modelName;
        this.carBrand = carBrand;
    }
}
