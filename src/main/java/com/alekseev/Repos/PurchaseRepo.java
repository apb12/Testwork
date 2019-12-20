package com.alekseev.Repos;

import com.alekseev.Entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface PurchaseRepo extends JpaRepository<Purchase,Long> {
    @Query("SELECT p FROM Purchase p WHERE p.purchaseDate BETWEEN :from AND :to")
    List<Purchase> purchaseListBetweenDates(@Param("from") Timestamp f, @Param("to") Timestamp t);

    @Query("SELECT  p.name ,p.lastName FROM Purchase p WHERE p.purchaseDate BETWEEN :from AND :to GROUP BY p.name , p.lastName ORDER BY COUNT(p.lastName) DESC")
    List<String> bestBuyer(@Param("from")Timestamp f,@Param("to")Timestamp t);

    @Query("SELECT  i.id  FROM Purchase p left JOIN p.purchaseItem i WHERE p.purchaseDate BETWEEN :from AND :to GROUP BY i.id  ORDER BY COUNT(i.id) DESC ")
    List<String> bestItemfromMounth(@Param("from")Timestamp f,@Param("to")Timestamp t);
    @Query("SELECT  i.id  FROM Purchase p left JOIN p.purchaseItem i WHERE p.age = :age GROUP BY i.id  ORDER BY COUNT(i.id) DESC ")
    List<String> bestItem18year(@Param("age")Integer age);


}
