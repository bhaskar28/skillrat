package com.training.core.data;


public class RegionData 
{
	private Long id;
	private String isoCode;
	private String isoWithCountryCode;
	private String name;
	private Long countryId;
	
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
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
}
