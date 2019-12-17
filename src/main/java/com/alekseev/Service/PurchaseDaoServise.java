package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseDaoServise {
    void save(Purchase p);
    List<Purchase>findAll();
}
