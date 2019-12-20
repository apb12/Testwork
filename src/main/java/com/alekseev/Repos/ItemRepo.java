package com.alekseev.Repos;

import com.alekseev.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for Item
 */
public interface ItemRepo extends JpaRepository<Item,Long> {
    Item findByName(String name);
}
