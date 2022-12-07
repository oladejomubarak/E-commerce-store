package store.service;

import store.data.dto.AddProductRequest;
import store.data.dto.AddProductResponse;
import store.data.models.Product;
import store.data.repositories.ProductRepository;
import store.data.repositories.ProductRepositoryImpl;

import java.math.BigDecimal;

public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public AddProductResponse addProduct(AddProductRequest addProductRequest) {
        Product product = new Product();
        product.setPrice(BigDecimal.valueOf(addProductRequest.getPrice()));
        product.setCategory(addProductRequest.getCategory());
        return null;
    }

}
