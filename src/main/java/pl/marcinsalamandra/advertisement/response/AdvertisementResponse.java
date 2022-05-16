package pl.marcinsalamandra.advertisement.response;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class AdvertisementResponse {
    private String secretKey;
    // parameters
    private String color;
    private Integer vintage;
    private Integer mileage;
    private Integer power;
    private String fuel;

    // model
    private String modelName;
    private String carBody;

    // brand
    private String brandName;
    private String country;

    // advertisement
    private String description;
    private String title;
    private Integer price;
    private String email;
    private String phone;
}
