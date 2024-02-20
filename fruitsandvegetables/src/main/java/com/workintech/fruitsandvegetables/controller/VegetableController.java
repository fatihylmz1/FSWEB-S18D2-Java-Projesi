package com.workintech.fruitsandvegetables.controller;

import com.workintech.fruitsandvegetables.entity.Vegetable;
import com.workintech.fruitsandvegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("workintech/vegetables")
public class VegetableController {
    private VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> getAllVegetables() {
        return vegetableService.getAllVegetablesOrderByPriceAsc();
    }

    @GetMapping("/{id}")
    public Vegetable getVegetableById(@PathVariable Long id) {
        return vegetableService.getVegetableById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> getAllVegetablesDesc() {
        return vegetableService.getAllVegetablesOrderByPriceDesc();
    }

    @PostMapping
    public Vegetable saveOrUpdateVegetable(@RequestBody Vegetable vegetable) {
        return vegetableService.saveVegetable(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> getVegetablesByName(@PathVariable String name) {
        return vegetableService.getVegetablesByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteVegetable(@PathVariable Long id) {
        vegetableService.deleteVegetable(id);
    }
}
