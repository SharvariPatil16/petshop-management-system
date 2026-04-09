package com.petshop.petservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pets")
@Data
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petId;

    private String name;
    private String breed;
    private Integer age;
    private Double price;

    private String description;
    private String imageUrl;
    
    

    public Long getPetId() {
		return petId;
	}



	public void setPetId(Long petId) {
		this.petId = petId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public PetCategory getCategory() {
		return category;
	}



	public void setCategory(PetCategory category) {
		this.category = category;
	}



	@ManyToOne
    @JoinColumn(name = "category_id")
    private PetCategory category;
    
    
}