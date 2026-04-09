package com.petshop.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.service.*;

import java.util.List;
@RestController
@RequestMapping("/food")
class PetFoodController {

    @Autowired private PetFoodService service;
    @Autowired private PetFoodMappingService mapping;

    @PostMapping
    public PetFood create(@RequestBody PetFood f){
        return service.save(f);
    }

    @GetMapping
    public List<PetFood> getAll(){
        return service.getAll();
    }

    @PostMapping("/pets/{petId}/{foodId}")
    public PetFoodMapping assign(@PathVariable Long petId,
                                 @PathVariable Long foodId){
        return mapping.assign(petId, foodId);
    }
}
