package store.data.repositories;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import store.data.models.Buyer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuyerRepositoryImplTest {
    private static final BuyerRepository buyerRepository = new BuyerRepositoryImpl();
    private  Buyer buyer;
    private  Buyer secondBuyer;
    @BeforeEach
    void setUp() {
        buyer = new Buyer();
        buyer.setFirstName("Godman");
        buyer.setLastName("Buhari");
        buyer.setEmail("emilokan20222@gmail.com");
        buyer.setPassword("IloveNaija2022");

        secondBuyer = new Buyer();
        secondBuyer.setFirstName("Goman");
        secondBuyer.setLastName("Buhar");
        secondBuyer.setEmail("emiloka20222@gmail.com");
        secondBuyer.setPassword("IlovNaija2022");
    }

    @AfterEach
    void tearDown() {
        buyerRepository.deleteAll();
    }

    @Test
    void saveTest() {
        //before save
        assertEquals(0, buyer.getId());
        //assertEquals(0, buyerRepository.save(buyer));
        //save buyer
        Buyer savedBuyer = buyerRepository.save(buyer);
        //buyer has id
        assertEquals(1, savedBuyer.getId());
    }

    @Test
    void findByIdTest() {
        Buyer firstSavedBuyer = buyerRepository.save(buyer);
        Buyer secondSavedBuyer = buyerRepository.save(secondBuyer);

        Buyer foundBuyer = buyerRepository.findById(2);
        assertEquals(foundBuyer, secondSavedBuyer);

    }

    @Test
    void findAllTest() {
        buyerRepository.save(buyer);
        List<Buyer> listOfAllBuyersInDb  = buyerRepository.findAll();
        assertEquals(1, listOfAllBuyersInDb.size());
        // there is one user in the db
        List<Buyer> buyersList = buyerRepository.findAll();
        assertEquals(1, buyersList.size());

        //save second buyer
        Buyer savedSecondBuyer = buyerRepository.save(secondBuyer);
        //2nd buyer's id is 2
        assertEquals(2, savedSecondBuyer.getId());
        //there are two buyers in the db
        buyersList = buyerRepository.findAll();
        assertEquals(2, buyersList.size());
    }

    @Test
    void deleteTest() {
    }
    @Test
    void deleteAllTest(){
        buyerRepository.save(buyer);
        assertEquals(1, buyerRepository.findAll().size());
        buyerRepository.deleteAll();
        assertEquals(0, buyerRepository.findAll().size());
    }
}