package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import com.alekseev.Repos.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PurchaseDaoServiceImpl implements PurchaseDaoServiсe {
    @Autowired
    private PurchaseRepo purchaseRepo;
    @Override
    public void save(Purchase p) {
        purchaseRepo.save(p);
    }

    @Override
    public List<Purchase> findAll() {
        return purchaseRepo.findAll();
    }

    @Override
    public Purchase findById(Long id) {
        return purchaseRepo.getOne(id);
    }

    @Override
    public void delete(Purchase p) {
        purchaseRepo.delete(p);
    }

    @Override
    public List<Purchase> purchaseListBetweenDates(Timestamp f, Timestamp t) {
        return purchaseRepo.purchaseListBetweenDates(f,t);
    }

    @Override
    public List<String> bestBuyer(Timestamp f, Timestamp t) {
        return purchaseRepo.bestBuyer(f,t);
    }

    @Override
    public List<String> bestItemfromMounth(Timestamp f, Timestamp t) {
        return purchaseRepo.bestItemfromMounth(f,t);
    }

    @Override
    public List<String> bestItem18year(Integer age) {
        return purchaseRepo.bestItem18year(age);
    }


}
