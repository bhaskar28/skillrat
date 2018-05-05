package com.training.core.service;
import org.springframework.security.oauth2.provider.ClientDetails;

import com.training.core.model.CustomerModel;

public interface CustomerService 
{
	void saveCustomer(CustomerModel customerModel);
	CustomerModel getCustomerById(Long id);
	CustomerModel getCustomerByUserName(String username);
	ClientDetails  getByClientId(String clientId);
}
