package pl.marcinsalamandra.advertisement.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BuyAdvertisementRequest {
    private String buyerEmail;
    private String buyerPhone;
}
