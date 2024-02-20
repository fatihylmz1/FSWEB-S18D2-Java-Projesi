package com.workintech.fruitsandvegetables.dao;

import com.workintech.fruitsandvegetables.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {
    List<Vegetable> findAllByOrderByPriceDesc();
    List<Vegetable> findAllByOrderByPriceAsc();
    List<Vegetable> findAllByNameContainingIgnoreCase(String name);
}
