package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import com.alekseev.Repos.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Service implementing Purchase Dao interface
 */
@Service
public class PurchaseDaoServiceImpl implements PurchaseDaoServiсe {
    @Autowired
    private PurchaseRepo purchaseRepo;
    @Override
    public void save(Purchase p) {
        purchaseRepo.save(p);
    }

    /**
     * Method find all purchases
     */
    @Override
    public List<Purchase> findAll() {
        return purchaseRepo.findAll();
    }
    /**
     * Method find purchase by id
     */
    @Override
    public Purchase findById(Long id) {
        return purchaseRepo.getOne(id);
    }

    /**
     * Method delete purchase
     * @param p Purchase
     */
    @Override
    public void delete(Purchase p) {
        purchaseRepo.delete(p);
    }

    /**
     * Method find all purchases between some dates
     * @param f Date from
     * @param t Date to
     */
    @Override
    public List<Purchase> purchaseListBetweenDates(Timestamp f, Timestamp t) {
        return purchaseRepo.purchaseListBetweenDates(f,t);
    }

    /**
     * Method find best buyer between some dates
     * @param f Date from
     * @param t Date to
     */
    @Override
    public List<String> bestBuyer(Timestamp f, Timestamp t) {
        return purchaseRepo.bestBuyer(f,t);
    }
    /**
     * Method find bestseller item between some dates
     * @param f Date from
     * @param t Date to
     */
    @Override
    public List<String> bestItemfromMounth(Timestamp f, Timestamp t) {
        return purchaseRepo.bestItemfromMounth(f,t);
    }

    /**
     * Method find bestseller item by 18 yo
     * @param age Buyer age
     */
    @Override
    public List<String> bestItem18year(Integer age) {
        return purchaseRepo.bestItem18year(age);
    }


}
