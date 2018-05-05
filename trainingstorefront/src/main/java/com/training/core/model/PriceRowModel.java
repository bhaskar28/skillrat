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
@Table(name="PRICE_ROW")
public class PriceRowModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="FIXED_PRICE")
	private BigDecimal fixedPrice;
	
	@Column(name="MINIMUM_PRICE")
	private BigDecimal minimumPrice;
	
	@Column(name="MAXIMUM_PRICE")
	private BigDecimal maximumPrice;

	@OneToOne
	@JoinColumn(name = "CURRENCY")
	private CurrencyModel currency;
	
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

	public BigDecimal getMinimumPrice() {
		return minimumPrice;
	}

	public void setMinimumPrice(BigDecimal minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public BigDecimal getMaximumPrice() {
		return maximumPrice;
	}

	public void setMaximumPrice(BigDecimal maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public CurrencyModel getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyModel currency) {
		this.currency = currency;
	}
	
}
