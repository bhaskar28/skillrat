package com.training.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class AddressModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="LINE_1")
	private String line1;
	
	@Column(name="LINE_2")
	private String line2;
	
	@Column(name="LINE_3")
	private String line3;
	
	@Column(name="PINCODE")
	private Integer pincode;
	
	@Column(name="CONTACT")
	private String contact;
	
	@Column(name="EMAIL")
	private String email;
	
	@OneToOne
	@JoinColumn(name = "REGION")
	private RegionModel region;
	
	@OneToOne
	@JoinColumn(name = "COUNTRY")
	private CountryModel country;
	
	@Column(name="IS_DEFAULT")
	private Boolean isDefault;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public RegionModel getRegion() {
		return region;
	}
	public void setRegion(RegionModel region) {
		this.region = region;
	}
	public CountryModel getCountry() {
		return country;
	}
	public void setCountry(CountryModel country) {
		this.country = country;
	}
	public Boolean getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
