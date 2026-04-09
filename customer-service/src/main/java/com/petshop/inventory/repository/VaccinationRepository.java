package com.petshop.inventory.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.inventory.entity.*;
public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {}
