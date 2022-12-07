package store.data.dto;

import lombok.Data;

@Data
public class AddProductResponse {
    private String message;
    private int StatusCode;
    private int productId;

}
