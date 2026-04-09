package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_food_relationship")
@Data
public class PetFoodMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long petId;
    private Long foodId;
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
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
}