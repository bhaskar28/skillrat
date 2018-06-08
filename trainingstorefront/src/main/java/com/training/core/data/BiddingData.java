package com.training.core.data;

import java.math.BigDecimal;

public class BiddingData 
{
	private Long id;
	private String description;
	private BigDecimal bidPrice;
	private Long productId;
	private Long customerId;
	private ProductData productData;
	private CustomerData customerData;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public ProductData getProductData() {
		return productData;
	}
	public void setProductData(ProductData productData) {
		this.productData = productData;
	}
	public CustomerData getCustomerData() {
		return customerData;
	}
	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}
	
}
