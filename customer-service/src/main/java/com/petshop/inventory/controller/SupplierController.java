package com.petshop.inventory.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.service.*;

import java.util.List;
@RestController
@RequestMapping("/suppliers")
class SupplierController {

    @Autowired private SupplierService service;
    @Autowired private PetSupplierService mapping;

    @PostMapping
    public Supplier create(@RequestBody Supplier s){
        return service.save(s);
    }

    @GetMapping
    public List<Supplier> getAll(){
        return service.getAll();
    }

    @PostMapping("/pets/{petId}/{supplierId}")
    public PetSupplier assign(@PathVariable Long petId,
                              @PathVariable Long supplierId){
        return mapping.assign(petId, supplierId);
    }
}
