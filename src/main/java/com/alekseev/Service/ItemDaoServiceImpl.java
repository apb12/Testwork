package com.alekseev.Service;

import com.alekseev.Entity.Item;
import com.alekseev.Repos.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemDaoServiceImpl implements ItemDaoService {
    @Autowired
    private ItemRepo itemRepo;
    @Override
    public List<Item> findAll() {
        return itemRepo.findAll();
    }

    @Override
    public Item findById(Long id) {
        return itemRepo.getOne(id);
    }

    @Override
    public Item findByName(String name) {
        return itemRepo.findByName(name);
    }


}
