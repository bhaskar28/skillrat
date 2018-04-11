package com.training.core.data;

import com.training.core.model.CountryModel;

public class RegionData {
	private Long id;
	private String isoCode;
	private String isoWithCountryCode;
	private String name;
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
	@Override
	public String toString() {
		return "Data [id=" + id + ", isoWithCountryCode=" + isoWithCountryCode + ", name=" + name +",country="+country+",isoCode="+isoCode+",email="+     "]";
	}
}
