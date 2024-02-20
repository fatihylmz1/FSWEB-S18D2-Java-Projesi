package com.workintech.fruitsandvegetables.services;

import com.workintech.fruitsandvegetables.dao.VegetableRepository;
import com.workintech.fruitsandvegetables.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VegetableServiceImpl implements VegetableService{
    private VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public List<Vegetable> getAllVegetables() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable getVegetableById(Long id) {
        return vegetableRepository.findById(id).orElse(null);
    }

    @Override
    public Vegetable saveVegetable(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public void deleteVegetable(Long id) {
        vegetableRepository.deleteById(id);
    }

    @Override
    public List<Vegetable> getAllVegetablesOrderByPriceDesc() {
        return vegetableRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Vegetable> getAllVegetablesOrderByPriceAsc() {
        return vegetableRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Vegetable> getVegetablesByName(String name) {
        return vegetableRepository.findAllByNameContainingIgnoreCase(name);
    }
}
