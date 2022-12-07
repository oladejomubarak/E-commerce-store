package store.data.repositories;

import store.data.models.Buyer;

import java.util.List;

public interface BuyerRepository {
    Buyer save(Buyer buyer);
    Buyer findById(int id);
    List<Buyer> findAll();

    void delete(Buyer buyer);

    void deleteAll();
}
