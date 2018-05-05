package com.training.core.customer.dao;

import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import com.training.core.model.CustomerModel;

public interface CustomerDao 
{
	void saveUser(CustomerModel customerModel);
	CustomerModel getCustomerById(Long id);
	CustomerModel getCustomerByUserName(String username);
	BaseClientDetails  getByClientId(String clientId);
}
