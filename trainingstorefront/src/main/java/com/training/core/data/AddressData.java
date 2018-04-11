package com.training.core.data;

import com.training.core.model.CountryModel;
import com.training.core.model.RegionModel;

public class AddressData {
	private Long id;
	private String line1;
	private String line2;
	private String line3;
	private Integer pincode;
	private String contact;
	private String email;
	private RegionModel region;
	private CountryModel country;
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
	@Override
	public String toString() {
		return "Data [id=" + id + ", line1=" + line1 + ", line2=" + line2 +", line3="
				+ line3 +",country="+country+",region="+region+",email="+email+",contact="+contact+ ",pincode="+pincode+      "]";
	}
}
