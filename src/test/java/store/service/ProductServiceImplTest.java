package store.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.data.dto.AddProductRequest;
import store.data.dto.AddProductResponse;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {
    private final ProductService productService = new ProductServiceImpl();
    private AddProductRequest addProductRequest;

    @BeforeEach
    void setUp() {
        addProductRequest = new AddProductRequest();
        addProductRequest.setName("milo");
        addProductRequest.setPrice(20.00);
        addProductRequest.setCategory("beverages");
    }
    @Test
    void setAddProductTest(){
        AddProductResponse response = productService.addProduct(addProductRequest);
        assertNotNull(response);
    }
}