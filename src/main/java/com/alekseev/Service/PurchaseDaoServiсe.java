package com.alekseev.Service;

import com.alekseev.Entity.Purchase;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for Purchase Dao
 */
@Service
public interface PurchaseDaoServiсe {
    void save(Purchase p);
    List<Purchase>findAll();
    Purchase findById(Long id);
    void delete(Purchase p);
    List<Purchase> purchaseListBetweenDates(Timestamp f, Timestamp t);
    List<String> bestBuyer(Timestamp f,Timestamp t);
    List<String> bestItemfromMounth(Timestamp f,Timestamp t);
    List<String> bestItem18year(Integer age);


}
