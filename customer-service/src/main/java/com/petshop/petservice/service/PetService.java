package com.petshop.petservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.petservice.entity.Pet;
import com.petshop.petservice.repository.PetRepository;

import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repo;

    public Pet save(Pet p) {
        return repo.save(p);
    }

    public List<Pet> getAll() {
        return repo.findAll();
    }

    public Pet getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Pet updateImage(Long id, String url) {
        Pet p = repo.findById(id).orElseThrow();
        p.setImageUrl(url);
        return repo.save(p);
    }
}