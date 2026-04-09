package com.petshop.petservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.petservice.entity.Pet;
import com.petshop.petservice.service.PetService;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService service;

    @PostMapping
    public Pet create(@RequestBody Pet p) {
        return service.save(p);
    }

    @GetMapping
    public List<Pet> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Pet getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}/image")
    public Pet updateImage(@PathVariable Long id,
                           @RequestBody String url) {
        return service.updateImage(id, url);
    }
}