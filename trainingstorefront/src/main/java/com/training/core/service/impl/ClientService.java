package com.training.core.service.impl;

import javax.annotation.Resource;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.transaction.annotation.Transactional;

import com.training.core.customer.dao.CustomerDao;

public class ClientService implements ClientDetailsService 
{
	@Resource(name="customerDao")
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public ClientDetails loadClientByClientId(String clientid) throws ClientRegistrationException 
	{
		return customerDao.getByClientId(clientid);
	}
	
}
