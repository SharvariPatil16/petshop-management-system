package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pet_food")
@Data
public class PetFood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;

    private String name;
    private String brand;
    private String type;
    private Integer quantity;
    private Double price;
	public Long getFoodId() {
		return foodId;
	}
	public void setFoodId(Long foodId) {
		this.foodId = foodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
    
    
}