package pl.marcinsalamandra.parameters;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "parameters")
@Entity(name = "Parameters")
public class Parameters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "color")
    private String color;

    @Column(name = "vintage")
    private Integer vintage;

    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "power")
    private Integer power;

    @Column(name = "fuel")
    private String fuel;

    public Parameters(String color,
                      Integer vintage,
                      Integer mileage,
                      Integer power,
                      String fuel) {
        this.color = color;
        this.vintage = vintage;
        this.mileage = mileage;
        this.power = power;
        this.fuel = fuel;
    }
}
