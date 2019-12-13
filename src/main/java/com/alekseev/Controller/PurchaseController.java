package com.alekseev.Controller;

import com.alekseev.Entity.Purchase;
import com.alekseev.Repos.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {
    @Autowired
    private PurchaseRepo purchaseRepo;

    @RequestMapping("/save")
    public void savePurchase(
            @RequestBody Purchase purchase
            ){
        purchaseRepo.save(purchase);
    }
}
