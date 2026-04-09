package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class PetFoodService {
    @Autowired private PetFoodRepository repo;
    public PetFood save(PetFood f){ return repo.save(f); }
    public List<PetFood> getAll(){ return repo.findAll(); }
}