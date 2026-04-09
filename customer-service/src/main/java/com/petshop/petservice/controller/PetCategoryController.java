package com.petshop.petservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.petservice.entity.PetCategory;
import com.petshop.petservice.service.PetCategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class PetCategoryController {

    @Autowired
    private PetCategoryService service;

    @PostMapping
    public PetCategory create(@RequestBody PetCategory c) {
        return service.save(c);
    }

    @GetMapping
    public List<PetCategory> getAll() {
        return service.getAll();
    }
}