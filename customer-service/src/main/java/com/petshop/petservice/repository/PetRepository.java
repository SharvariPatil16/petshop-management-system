package com.petshop.petservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.petservice.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {}