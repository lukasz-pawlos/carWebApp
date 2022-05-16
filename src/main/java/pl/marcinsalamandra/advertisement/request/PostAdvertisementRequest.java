package pl.marcinsalamandra.advertisement.request;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PostAdvertisementRequest {
    // parameters
    private String color;
    private Integer vintage;
    private Integer mileage;
    private Integer power;
    private String fuel;

    // model
    private String modelName;

    // advertisement
    private String description;
    private String title;
    private Integer price;
    private String email;
    private String phone;
}
