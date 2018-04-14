package com.training.core.response.data;

import java.util.List;

import com.training.core.data.CustomerData;

public class CustomerResponseData extends ResponseData
{
	private CustomerData customer;

	private List<CustomerData> customers;
	
	public CustomerData getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerData customer) {
		this.customer = customer;
	}

	public List<CustomerData> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerData> customers) {
		this.customers = customers;
	}
	
}
