package store.data.dto;

import lombok.Data;

@Data
public class BuyerRegistrationRequest {
    private String email;
    private String password;
    private String phoneNumber;
    private String address;

}
