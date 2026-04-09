package com.petshop.petservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.petservice.entity.EmployeePet;

public interface EmployeePetRepository extends JpaRepository<EmployeePet, Long> {}