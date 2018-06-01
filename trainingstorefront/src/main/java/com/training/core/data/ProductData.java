package com.training.core.data;

public class ProductData 
{
	private Long id;
	private String name;
	private String description;
	private PriceRowData priceRow;
	private Long customerId;
	
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
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
}
