package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import com.alekseev.Repos.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseDaoServiceImpl implements PurchaseDaoServise {
    @Autowired
    private PurchaseRepo purchaseRepo;
    @Override
    public void save(Purchase p) {
        purchaseRepo.save(p);


    }
}
