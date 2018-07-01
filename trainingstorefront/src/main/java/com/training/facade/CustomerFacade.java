package com.training.facade;

import com.training.core.data.CustomerData;

public interface CustomerFacade 
{
	CustomerData getCustomerById(Long customerId);
	CustomerData getCustomerByUsername(String username);
	CustomerData createCustomer(CustomerData customerData);
}
