package com.training.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="REGION")
@Entity
public class RegionModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="ISO_CODE")
	private String isoCode;
	
	@Column(name="ISO_COUNTRY_ISO")
	private String isoWithCountryCode;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne
	@JoinColumn(name = "COUNTRY")
	private CountryModel country;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsoCode() {
		return isoCode;
	}
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	public String getIsoWithCountryCode() {
		return isoWithCountryCode;
	}
	public void setIsoWithCountryCode(String isoWithCountryCode) {
		this.isoWithCountryCode = isoWithCountryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CountryModel getCountry() {
		return country;
	}
	public void setCountry(CountryModel country) {
		this.country = country;
	}
	
}
