package com.petshop.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.service.*;

import java.util.List;
@RestController
@RequestMapping("/vaccinations")
class VaccinationController {

    @Autowired private VaccinationService service;
    @Autowired private PetVaccinationService mapping;

    @PostMapping
    public Vaccination create(@RequestBody Vaccination v){
        return service.save(v);
    }

    @GetMapping
    public List<Vaccination> getAll(){
        return service.getAll();
    }

    @PostMapping("/pets/{petId}/{vaccinationId}")
    public PetVaccination assign(@PathVariable Long petId,
                                 @PathVariable Long vaccinationId){
        return mapping.assign(petId, vaccinationId);
    }
}