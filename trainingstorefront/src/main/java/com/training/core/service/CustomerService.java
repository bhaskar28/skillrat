package com.training.core.service;
import com.training.core.model.CustomerModel;

public interface CustomerService 
{
	void saveCustomer(CustomerModel customerModel);
	CustomerModel getCustomerById(Long id);
	CustomerModel getCustomerByUserName(String username);
}
