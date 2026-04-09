package com.petshop.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.service.*;

import java.util.List;
@RestController
@RequestMapping("/grooming")
public class GroomingController {

    @Autowired private GroomingServiceService service;
    @Autowired private PetGroomingService mapping;

    @PostMapping
    public GroomingService create(@RequestBody GroomingService g){
        return service.save(g);
    }

    @GetMapping
    public List<GroomingService> getAll(){
        return service.getAll();
    }

    @PostMapping("/pets/{petId}/{serviceId}")
    public PetGrooming assign(@PathVariable Long petId,
                              @PathVariable Long serviceId){
        return mapping.assign(petId, serviceId);
    }
}
