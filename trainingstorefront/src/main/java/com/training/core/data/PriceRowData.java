package com.training.core.data;

import java.math.BigDecimal;

public class PriceRowData 
{
	private Long id;
	private BigDecimal fixedPrice;
	private BigDecimal minimum;
	private BigDecimal maximum;
	private String currencyCode;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(BigDecimal fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public BigDecimal getMinimum() {
		return minimum;
	}
	public void setMinimum(BigDecimal minimum) {
		this.minimum = minimum;
	}
	public BigDecimal getMaximum() {
		return maximum;
	}
	public void setMaximum(BigDecimal maximum) {
		this.maximum = maximum;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
