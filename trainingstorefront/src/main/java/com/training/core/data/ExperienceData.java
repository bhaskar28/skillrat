package com.training.core.data;


public class ExperienceData 
{
	private Long id;
	private Integer years;
	private Integer months;
	private String summary;
	private Long customerId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getMonths() {
		return years;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", customerId=" + customerId+", months=" + months+", years=" + years+", summary=" + summary+       "]";
	}
}
