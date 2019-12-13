package com.alekseev.Repos;

import com.alekseev.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepo extends JpaRepository<Purchase,Long> {
}
