package com.alekseev.Entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private LocalDateTime purchaseDate;
    @ManyToOne
    private Item purchaseItem;

}
