package com.alekseev.Service;

import com.alekseev.Entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemDaoService {
    List<Item>findAll();
}
