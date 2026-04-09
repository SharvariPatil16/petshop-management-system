package com.petshop.inventory.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.inventory.entity.*;
import com.petshop.inventory.repository.*;

import java.util.List;

@Service
public class GroomingServiceService {
    @Autowired private GroomingServiceRepository repo;
    public GroomingService save(GroomingService g){ return repo.save(g); }
    public List<GroomingService> getAll(){ return repo.findAll(); }
}
