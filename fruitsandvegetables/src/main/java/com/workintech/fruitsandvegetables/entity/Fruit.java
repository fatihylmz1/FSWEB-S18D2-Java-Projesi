package com.workintech.fruitsandvegetables.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Fruit")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fruit_id")
    private Long id;

    @Column(name = "fruit_name")
    private String name;

    @Column(name = "fruit_price")
    private double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
