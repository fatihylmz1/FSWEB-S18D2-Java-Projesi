package com.workintech.fruitsandvegetables.controller;

import com.workintech.fruitsandvegetables.entity.Fruit;
import com.workintech.fruitsandvegetables.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/fruits")
public class FruitController {
    private FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    public List<Fruit> getAllFruits(){
        return fruitService.getAllFruitsOrderByPriceAsc();
    }
    @GetMapping("/{id}")
    public Fruit getFruitById(@PathVariable Long id){
        return fruitService.getFruitById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> getAllFruitsDesc(){
        return fruitService.getAllFruitsOrderByPriceDesc();
    }
    @PostMapping
    public Fruit saveOrUpdateFruit(@RequestBody Fruit fruit) {
        return fruitService.saveFruit(fruit);
    }

    @GetMapping("{name}")
    public List<Fruit> getFruitsByName(@PathVariable String name) {
        return fruitService.getFruitsByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruit(id);
    }
}
