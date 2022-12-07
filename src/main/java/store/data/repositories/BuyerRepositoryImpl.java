package store.data.repositories;

import store.StoreException;
import store.data.models.Buyer;

import java.util.ArrayList;
import java.util.List;

public class BuyerRepositoryImpl implements BuyerRepository{
    private final List<Buyer> buyers  = new ArrayList<>();
    @Override
    public Buyer save(Buyer buyer) {
        int newId = generateId();
        buyer.setId(newId);
        buyers.add(buyer);
        return buyer;
    }

    @Override
    public Buyer findById(int id) {

        for (Buyer buyer:buyers){
            if(buyer.getId()== id)return buyer;
        }
        throw new StoreException("buyer ain't found");
    }

    @Override
    public List<Buyer> findAll() {
        return buyers;
    }

    @Override
    public void delete(Buyer buyer) {

    }

    @Override
    public void deleteAll() {
        buyers.clear();


    }

    private int generateId(){
        int numberOfBuyerInDb = buyers.size();
        return numberOfBuyerInDb+1;

    }
}
