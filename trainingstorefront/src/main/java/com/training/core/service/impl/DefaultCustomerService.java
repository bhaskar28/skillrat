package com.training.core.service.impl;

import javax.annotation.Resource;

import javax.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.stereotype.Service;

import com.training.core.customer.dao.CustomerDao;
import com.training.core.data.CustomerData;
import com.training.core.data.EmailData;
import com.training.core.mail.service.EmailSenderService;
import com.training.core.model.CustomerModel;
import com.training.core.service.CustomerService;

@Service("customerService")
public class DefaultCustomerService implements CustomerService
{
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Resource(name="emailSenderService")
	private EmailSenderService emailSenderService;
	
	@Override
	@Transactional
	@CacheEvict(value="customersCache", key="#id")
	public void saveCustomer(CustomerModel customerModel) 
	{
		customerDao.saveUser( customerModel);
		
		EmailData emailData= new EmailData();
		emailData.setTo(customerModel.getEmail());
		emailData.setFrom("vamsimch@gmail.com");
		emailData.setSubject("Thank you for registration");
		emailData.setTemplateName("emailtemplate.vm");
		
		CustomerData customerData= new CustomerData();
		customerData.setEmail(customerModel.getEmail());
		customerData.setFirstName(customerModel.getFirstName());
		customerData.setLastName(customerModel.getLastName());
		emailData.setCustomerData(customerData);
		emailSenderService.sendEmail(emailData);
	}


	@Override
	@Transactional
	@Cacheable(value="customersCache", key="#id")
	public CustomerModel getCustomerById(Long id) 
	{
		return customerDao.getCustomerById(id);
	}


	@Override
	@Transactional
	public CustomerModel getCustomerByUserName(String username) 
	{
		return customerDao.getCustomerByUserName(username);
	}


	@Override
	@Transactional
	public ClientDetails getByClientId(String clientId) 
	{
		return customerDao.getByClientId(clientId);
	}

}
