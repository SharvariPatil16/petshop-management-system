package com.petshop.petservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_categories")
@Data
public class PetCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String name;
}