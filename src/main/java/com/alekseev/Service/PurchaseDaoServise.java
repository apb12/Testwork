package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import org.springframework.stereotype.Service;

@Service
public interface PurchaseDaoServise {
    void save(Purchase p);
}
