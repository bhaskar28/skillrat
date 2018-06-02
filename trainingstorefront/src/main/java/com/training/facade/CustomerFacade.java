package com.training.facade;

import com.training.core.data.CustomerData;

public interface CustomerFacade 
{
	CustomerData getCustomerById(Long customerId);
}
