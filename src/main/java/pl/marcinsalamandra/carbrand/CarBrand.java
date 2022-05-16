package pl.marcinsalamandra.carbrand;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "car_brands")
@Entity(name = "CarBrand")
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "brand_name")
    private String brandName;

    public CarBrand(String country, String brandName) {
        this.country = country;
        this.brandName = brandName;
    }
}
