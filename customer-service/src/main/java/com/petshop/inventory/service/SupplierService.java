package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class SupplierService {
    @Autowired private SupplierRepository repo;
    public Supplier save(Supplier s){ return repo.save(s); }
    public List<Supplier> getAll(){ return repo.findAll(); }
}