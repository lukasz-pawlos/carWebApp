package pl.marcinsalamandra.advertisement;

import lombok.*;
import pl.marcinsalamandra.car.Car;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@Table(name = "advertisements")
@Entity(name = "Advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private Integer price;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "secret_key")
    private String secretKey;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;

    public Advertisement(String description,
                         String title,
                         Integer price,
                         String email,
                         String phone,
                         String secretKey,
                         Car car) {
        this.description = description;
        this.title = title;
        this.price = price;
        this.email = email;
        this.phone = phone;
        this.secretKey = secretKey;
        this.car = car;
    }
}
