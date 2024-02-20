package com.workintech.fruitsandvegetables.services;

import com.workintech.fruitsandvegetables.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getAllVegetables();
    Vegetable getVegetableById(Long id);
    Vegetable saveVegetable(Vegetable vegetable);
    void deleteVegetable(Long id);
    List<Vegetable> getAllVegetablesOrderByPriceDesc();
    List<Vegetable> getAllVegetablesOrderByPriceAsc();
    List<Vegetable> getVegetablesByName(String name);
}
