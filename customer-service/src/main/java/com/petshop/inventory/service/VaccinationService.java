package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class VaccinationService {
    @Autowired private VaccinationRepository repo;
    public Vaccination save(Vaccination v){ return repo.save(v); }
    public List<Vaccination> getAll(){ return repo.findAll(); }
}
