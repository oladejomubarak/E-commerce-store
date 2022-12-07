package store.data.dto;

import lombok.Data;

@Data
public class ProductPurchaseRequest {
    private int productId;
    private int quantity;
}
