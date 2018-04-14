package com.training.core.data;

public class CountryData {
	private Long id;
	private String name;
	private String isoCode;
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
	@Override
	public String toString() {
		return "Data [id=" + id + ", isoCode=" + isoCode+ ", name=" + name +     "]";
	}
}
