package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.CustomerData;
import com.training.core.model.CustomerModel;
import com.training.core.service.CustomerService;
import com.training.facade.CustomerFacade;

@Component("customerFacade")
public class DefaultCustomerFacade implements CustomerFacade
{
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Override
	public CustomerData getCustomerById(Long customerId) 
	{
		CustomerModel customerModel=customerService.getCustomerById(customerId);
		CustomerData customer= new CustomerData();
		customer.setFirstName(customerModel.getFirstName());
		customer.setFirstName(customerModel.getLastName());
		customer.setEmail(customerModel.getEmail());
		customer.setMobile(customerModel.getMobile());
		return customer;
	}

}
