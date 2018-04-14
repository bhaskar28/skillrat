package com.training.core.data;

import java.util.List;

public class CustomerData 
{
	private Long id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String password;
	private List<FieldData> fields;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public List<FieldData> getFields() {
		return fields;
	}
	public void setFields(List<FieldData> fields) {
		this.fields = fields;
	}
	
}
