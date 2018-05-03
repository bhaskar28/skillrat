package com.training.core.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CREATION_TIME")
	private  Date creationTime;
	
	@OneToOne
	@JoinColumn(name = "CATEGORY")
	private CategoryModel category;

	@OneToOne
	@JoinColumn(name = "OWNER")
	private CustomerModel owner;
	
	@OneToOne
	@JoinColumn(name = "PRICE")
	private PriceRowModel price;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Date getCreationTime() {
		return creationTime;
	}
	
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public CategoryModel getCategory() {
		return category;
	}

	public void setCategory(CategoryModel category) {
		this.category = category;
	}

	public CustomerModel getOwner() {
		return owner;
	}

	public void setOwner(CustomerModel owner) {
		this.owner = owner;
	}

	public PriceRowModel getPrice() {
		return price;
	}

	public void setPrice(PriceRowModel price) {
		this.price = price;
	}
	
}
