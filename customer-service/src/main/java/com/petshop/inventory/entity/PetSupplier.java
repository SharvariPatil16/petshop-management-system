package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_supplier_relationship")
@Data
public class PetSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long petId;
    private Long supplierId;
    
    
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
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
}