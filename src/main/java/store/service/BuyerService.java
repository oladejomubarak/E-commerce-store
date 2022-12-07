package store.service;

import store.data.dto.BuyerRegistrationRequest;
import store.data.dto.BuyerRegistrationResponse;
import store.data.dto.ProductPurchaseRequest;

public interface BuyerService {
    BuyerRegistrationResponse register (BuyerRegistrationRequest registrationRequest);
    String orderProduct(ProductPurchaseRequest productPurchaseRequest);
}
