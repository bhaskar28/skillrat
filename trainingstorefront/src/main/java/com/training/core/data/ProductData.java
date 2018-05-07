package com.training.core.data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductData 
{
	private Long id;
	
	@NotNull(message="Name can't be empty")
	@NotBlank(message="Description can't be empty")
	private String name;
	
	@NotNull(message="Description can't be empty")
	@NotBlank(message="Description can't be empty")
	private String description;
	
	private PriceRowData priceRow;
	
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
	public PriceRowData getPriceRow() {
		return priceRow;
	}
	public void setPriceRow(PriceRowData priceRow) {
		this.priceRow = priceRow;
	}
	
}
