package com.petshop.petservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.petservice.entity.EmployeePet;
import com.petshop.petservice.entity.Pet;
import com.petshop.petservice.repository.EmployeePetRepository;
import com.petshop.petservice.repository.PetRepository;

@Service
public class EmployeePetService {

    @Autowired
    private EmployeePetRepository repo;

    @Autowired
    private PetRepository petRepo;

    public EmployeePet assign(Long empId, Long petId) {

        Pet pet = petRepo.findById(petId).orElseThrow();

        EmployeePet ep = new EmployeePet();
        ep.setEmployeeId(empId);
        ep.setPet(pet);

        return repo.save(ep);
    }
}