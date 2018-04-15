package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NAME")
public class CityModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="ISO_CODE")
	private String cityIsoCode;
	
	@Column(name="ISO_CODE")
	private String name;

	@OneToOne
	@JoinColumn(name = "REGION")
	private RegionModel region;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityIsoCode() {
		return cityIsoCode;
	}

	public void setCityIsoCode(String cityIsoCode) {
		this.cityIsoCode = cityIsoCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RegionModel getRegion() {
		return region;
	}

	public void setRegion(RegionModel region) {
		this.region = region;
	}
	
	
}
