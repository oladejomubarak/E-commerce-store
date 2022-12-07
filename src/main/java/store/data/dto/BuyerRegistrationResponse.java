package store.data.dto;

import lombok.Data;

@Data
public class BuyerRegistrationResponse {
    private int userId;
    private String message;
    private int statusCode;

}
