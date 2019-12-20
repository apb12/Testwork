package com.alekseev.Service;

import com.alekseev.Entity.Item;
import com.alekseev.Repos.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of dao service for item
 */
@Service
public class ItemDaoServiceImpl implements ItemDaoService {
    @Autowired
    private ItemRepo itemRepo;

    /**
     * Method find all items
     * @return
     */
    @Override
    public List<Item> findAll() {
        return itemRepo.findAll();
    }

    /**
     * Method find item by id
     * @param id
     * @return
     */
    @Override
    public Item findById(Long id) {
        return itemRepo.getOne(id);
    }

    /**
     * Method find item by name
     * @param name
     * @return
     */
    @Override
    public Item findByName(String name) {
        return itemRepo.findByName(name);
    }


}
