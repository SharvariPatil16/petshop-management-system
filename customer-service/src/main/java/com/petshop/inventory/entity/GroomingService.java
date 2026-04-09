package com.petshop.inventory.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "grooming_services")
@Data
public class GroomingService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    private String name;
    private String description;
    private Double price;
    private Boolean available;
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
    
    
}