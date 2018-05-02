package com.training.core.service.impl;

import javax.annotation.Resource;

import javax.transaction.Transactional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.training.core.customer.dao.CustomerDao;
import com.training.core.model.CustomerModel;
import com.training.core.service.CustomerService;

@Service("customerService")
public class DefaultCustomerService implements CustomerService
{
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	

	@Override
	@Transactional
	public void saveCustomer(CustomerModel customerModel) 
	{
		customerDao.saveUser( customerModel);
	}


	@Override
	@Transactional
	@Cacheable(value="customersCache", key="#id")
	public CustomerModel getCustomerById(Long id) 
	{
		return customerDao.getCustomerById(id);
	}


	@Override
	public CustomerModel getCustomerByUserName(String username) 
	{
		return customerDao.getCustomerByUserName(username);
	}

}
