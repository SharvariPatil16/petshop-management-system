package com.petshop.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.inventory.entity.*;

public interface GroomingServiceRepository extends JpaRepository<GroomingService, Long> {}