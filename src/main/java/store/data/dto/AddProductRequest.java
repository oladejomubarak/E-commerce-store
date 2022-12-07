package store.data.dto;

import lombok.Data;
import store.data.models.Category;

@Data
public class AddProductRequest {
    private String name;
    private double price;
    private Category category;

}
