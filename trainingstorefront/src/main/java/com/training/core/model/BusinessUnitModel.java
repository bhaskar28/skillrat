package com.training.core.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BUSINESS_UNIT")
public class BusinessUnitModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="EMAIl")
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "BUSINESS_EMPLOYEE", joinColumns = {
	        @JoinColumn(name = "BUSINESS_ID")}, inverseJoinColumns = {
	        @JoinColumn(name = "EMPLOYEE_ID")})
	private Set<EmployeeModel> employees;
	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<EmployeeModel> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeModel> employees) {
		this.employees = employees;
	}
	
}
