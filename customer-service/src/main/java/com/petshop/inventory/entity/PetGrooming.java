package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_grooming_relationship")
@Data
public class PetGrooming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long petId;
    private Long serviceId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPetId() {
		return petId;
	}
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
}