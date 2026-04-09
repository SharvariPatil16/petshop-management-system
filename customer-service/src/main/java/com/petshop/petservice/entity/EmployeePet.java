package com.petshop.petservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee_pet_relationship")
public class EmployeePet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId; // simple version (no dependency)

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    // getters & setters
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Pet getPet() {
        return pet;
    }
}