package com.petshop.petservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.petservice.entity.PetCategory;
import com.petshop.petservice.repository.PetCategoryRepository;

import java.util.List;

@Service
public class PetCategoryService {

    @Autowired
    private PetCategoryRepository repo;

    public PetCategory save(PetCategory c) {
        return repo.save(c);
    }

    public List<PetCategory> getAll() {
        return repo.findAll();
    }
}