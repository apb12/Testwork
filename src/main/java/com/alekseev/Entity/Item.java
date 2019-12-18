package com.alekseev.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "purchaseItem")
    private List<Purchase>purchaseList;
    public Item(){}

    public Item(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
