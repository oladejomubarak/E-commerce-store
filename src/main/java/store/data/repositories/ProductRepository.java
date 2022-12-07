package store.data.repositories;


import store.data.models.Product;

import java.util.List;

public interface ProductRepository {
    Product save(Product product);
   Product findById(int id);
    List<Product> findAll();

    void delete(Product product);
}
