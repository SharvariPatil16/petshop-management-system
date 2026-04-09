package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class PetFoodMappingService {
    @Autowired private PetFoodMappingRepository repo;
    public PetFoodMapping assign(Long petId, Long foodId){
        PetFoodMapping pf = new PetFoodMapping();
        pf.setPetId(petId);
        pf.setFoodId(foodId);
        return repo.save(pf);
    }
}
