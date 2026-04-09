package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class PetVaccinationService {
    @Autowired private PetVaccinationRepository repo;
    public PetVaccination assign(Long petId, Long vaccinationId){
        PetVaccination pv = new PetVaccination();
        pv.setPetId(petId);
        pv.setVaccinationId(vaccinationId);
        return repo.save(pv);
    }
}
