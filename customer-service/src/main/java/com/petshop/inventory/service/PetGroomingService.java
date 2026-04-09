package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class PetGroomingService {
    @Autowired private PetGroomingRepository repo;
    public PetGrooming assign(Long petId, Long serviceId){
        PetGrooming pg = new PetGrooming();
        pg.setPetId(petId);
        pg.setServiceId(serviceId);
        return repo.save(pg);
    }
}