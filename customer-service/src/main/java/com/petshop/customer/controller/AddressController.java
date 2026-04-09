package com.petshop.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.petshop.customer.entity.Address;
import com.petshop.customer.service.AddressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService service;

    // ✅ CREATE Address
    @PostMapping
    public Address save(@RequestBody Address address) {
        return service.save(address);
    }

    // ✅ GET ALL Addresses
    @GetMapping
    public List<Address> getAll() {
        return service.getAll();
    }

    // ✅ GET Address by ID
    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    // ✅ UPDATE Address
    @PutMapping("/{id}")
    public Address update(@PathVariable Long id, @RequestBody Address address) {
        return service.update(id, address);
    }

    // ✅ DELETE Address
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
}