package com.alekseev.Repos;

import com.alekseev.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item,Long> {
    Item findByName(String name);
}
