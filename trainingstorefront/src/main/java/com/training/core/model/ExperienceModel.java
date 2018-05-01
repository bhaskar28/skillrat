package com.training.core.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="EXPERIENCE")
public class ExperienceModel 
{
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "YEARS")
	private Integer years;

	@Column(name = "MONTHS")
	private Integer months;

	@OneToMany
	@JoinColumn(name = "fields")
	private List<FieldModel> fields;

	@Column(name = "SUMMARY")
	private String summary;

	@OneToOne
	@JoinColumn(name = "CUSTOMER")
	private CustomerModel customer;

	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	
	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;

	}

	public void setSummary(String summary) {
		this.summary = summary;

	}

	public List<FieldModel> getFields() {
		return fields;
	}

	public void setFields(List<FieldModel> fields) {
		this.fields = fields;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public String getSummary() {
		return summary;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
