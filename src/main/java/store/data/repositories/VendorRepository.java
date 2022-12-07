package store.data.repositories;

import store.data.models.Vendor;

import java.util.List;

public interface VendorRepository {
    Vendor save(Vendor  vendor);
    Vendor findById(int id);
    List<Vendor> findAll();

    void delete(Vendor vendor);
}
