package com.workintech.fruitsandvegetables.dao;

import com.workintech.fruitsandvegetables.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Long > {
    List<Fruit> findAllByOrderByPriceDesc();
    List<Fruit> findAllByOrderByPriceAsc();
    List<Fruit> findAllByNameContainingIgnoreCase(String name);
}
