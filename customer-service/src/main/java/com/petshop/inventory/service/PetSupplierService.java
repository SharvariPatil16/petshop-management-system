package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class PetSupplierService {
    @Autowired private PetSupplierRepository repo;
    public PetSupplier assign(Long petId, Long supplierId){
        PetSupplier ps = new PetSupplier();
        ps.setPetId(petId);
        ps.setSupplierId(supplierId);
        return repo.save(ps);
    }
}