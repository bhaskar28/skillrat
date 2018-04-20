package com.training.core.customer.dao;

import com.training.core.model.CustomerModel;

public interface CustomerDao 
{
	void saveUser(CustomerModel customerModel);
	CustomerModel getCustomerById(Long id);
	CustomerModel getCustomerByUserName(String username);
}
