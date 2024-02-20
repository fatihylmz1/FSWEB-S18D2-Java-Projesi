package com.workintech.fruitsandvegetables.services;

import com.workintech.fruitsandvegetables.dao.FruitRepository;
import com.workintech.fruitsandvegetables.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{
    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id).orElse(null);
    }

    @Override
    public Fruit saveFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(Long id) {
        fruitRepository.deleteById(id);
    }

    @Override
    public List<Fruit> getAllFruitsOrderByPriceDesc() {
        return fruitRepository.findAllByOrderByPriceDesc();
    }

    @Override
    public List<Fruit> getAllFruitsOrderByPriceAsc() {
        return fruitRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Fruit> getFruitsByName(String name) {
        return fruitRepository.findAllByNameContainingIgnoreCase(name);
    }
}
