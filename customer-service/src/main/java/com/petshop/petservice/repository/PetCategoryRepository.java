package com.petshop.petservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petshop.petservice.entity.PetCategory;

public interface PetCategoryRepository extends JpaRepository<PetCategory, Long> {}