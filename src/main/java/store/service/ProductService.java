package store.service;

import store.data.dto.AddProductRequest;
import store.data.dto.AddProductResponse;

public interface ProductService {
    AddProductResponse addProduct(AddProductRequest addProductRequest);
}
