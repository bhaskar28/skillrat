package com.training.core.model;

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="CUSTOMER")
@AttributeOverrides({
    @AttributeOverride(name="creationTime", column=@Column(name="CREATION_TIME")),
    @AttributeOverride(name="modifiedTime", column=@Column(name="MODIFIED_TIME")),
    @AttributeOverride(name="createBy", column=@Column(name="CREATED_BY")),
    @AttributeOverride(name="modifiedBy", column=@Column(name="MODIFIED_BY"))
})
public class CustomerModel extends UserModel
{
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CUSTOMER_FIELDS", joinColumns = {
	        @JoinColumn(name = "CUSTOMER_ID")}, inverseJoinColumns = {
	        @JoinColumn(name = "FIELD_ID")})
    private Set<FieldModel> fields; 
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MOBILE")
	private String mobile;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "CUSTOMER_ADDRESSES", joinColumns = {
	        @JoinColumn(name = "CUSTOMER_ID")}, inverseJoinColumns = {
	        @JoinColumn(name = "ADDRESS_ID")})
    private Set<AddressModel> addresses;
	
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
	public Set<FieldModel> getFields() {
		return fields;
	}
	public void setFields(Set<FieldModel> fields) {
		this.fields = fields;
	}
	public Set<AddressModel> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<AddressModel> addresses) {
		this.addresses = addresses;
	}
	
}
