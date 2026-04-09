package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_vaccination_relationship")
@Data
public class PetVaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long petId;
    private Long vaccinationId;
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
	public Long getVaccinationId() {
		return vaccinationId;
	}
	public void setVaccinationId(Long vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
    
    
}