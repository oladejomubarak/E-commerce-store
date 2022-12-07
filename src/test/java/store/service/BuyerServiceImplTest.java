package store.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.data.dto.BuyerRegistrationRequest;
import store.data.dto.BuyerRegistrationResponse;
import store.data.dto.ProductPurchaseRequest;
import store.exception.BuyerRegistrationException;

import static org.junit.jupiter.api.Assertions.*;

class BuyerServiceImplTest {
    private final BuyerService buyerService = new BuyerServiceImpl();
    private BuyerRegistrationRequest firstBuyerRegisterRequest;
    private BuyerRegistrationRequest secondBuyerRegisterRequest;
    private ProductPurchaseRequest productPurchaseRequest;

    @BeforeEach
    void setUp() {
        firstBuyerRegisterRequest = new BuyerRegistrationRequest();
        firstBuyerRegisterRequest.setEmail("ademusa2022@gmail.com");
        firstBuyerRegisterRequest.setAddress("312, Herb Mac Way, Sabo-Yaba");
        firstBuyerRegisterRequest.setPassword("Ademusar2022@");
        firstBuyerRegisterRequest.setPhoneNumber("08162554783");

        secondBuyerRegisterRequest = new BuyerRegistrationRequest();
        secondBuyerRegisterRequest.setEmail("chikodiUmar115@yahoo.com");
        secondBuyerRegisterRequest.setPassword("chikod11");
        secondBuyerRegisterRequest.setPhoneNumber("080657352");
        secondBuyerRegisterRequest.setAddress("310, Herb Mac Way, Sabo-Yaba");

        productPurchaseRequest = new ProductPurchaseRequest();

    }

    @Test
    void registerTest() {
        BuyerRegistrationResponse response = buyerService.register(firstBuyerRegisterRequest);
        assertNotNull(response);
        assertEquals(response.getStatusCode(), 201);
    }
    @Test
    void userWithInvalidDetailsExcetionWhenRegistratingTest(){
        assertThrows(BuyerRegistrationException.class, ()-> buyerService.register(secondBuyerRegisterRequest));
    }

    @Test
    void orderProductTest() {
        String response = BuyerService.orderProduct(productPurchaseRequest);
        assertNotNull(response);

    }
}