package com.training.core.data;

import java.util.Date;

public class CityData 
{
	private Long id;
	private String name;
	private String isoCode;
	private RegionData region;
	private Date creationTime;
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
	public String getIsoCode() {
		return isoCode;
	}
	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
	public RegionData getRegion() {
		return region;
	}
	public void setRegion(RegionData region) {
		this.region = region;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	
}
