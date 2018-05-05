package com.training.core.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BIDDING")
public class BiddingModel 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@OneToOne
	@JoinColumn(name = "PRODUCT")
	private ProductModel product;
	
	@OneToOne
	@JoinColumn(name = "CUSTOMER")
	private CustomerModel customer;
	
	@Column(name="PRICE")
	private BigDecimal price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
