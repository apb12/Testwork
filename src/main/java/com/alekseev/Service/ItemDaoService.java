package com.alekseev.Service;

import com.alekseev.Entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Interface for Dao item
 */
@Service
public interface ItemDaoService {
    List<Item>findAll();
    Item findById(Long id);
    Item findByName(String name);
}
