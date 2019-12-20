package com.alekseev.Entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data

public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer count;
    private String name;
    private String lastName;
    private Integer age;
    private BigDecimal amount;
    private Timestamp purchaseDate;
    @ManyToOne
    private Item purchaseItem;

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", amount=" + amount +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}
