package com.training.core.customer.dao.impl;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.training.core.customer.dao.CustomerDao;
import com.training.core.dao.RoleDao;
import com.training.core.model.CustomerModel;
import com.training.core.model.UserRoleModel;

@Repository("customerDao")
public class DefaultCustomerDao implements CustomerDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Resource(name="roleDao")
	private RoleDao roleDao;
	
	@Override
	public void saveUser(CustomerModel customerModel) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(customerModel);
	}

	@Override
	public CustomerModel getCustomerById(Long id) 
	{
		return (CustomerModel) sessionFactory.getCurrentSession().get(CustomerModel.class, id);
	}

	@Override
	public CustomerModel getCustomerByUserName(String username) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CustomerModel.class.getName()+" "
				+ " where email =:username");
		query.setParameter("username", username);
		
		if(null == query || CollectionUtils.isEmpty(query.list()))
		{
			return null;
		}
		return (CustomerModel) query.list().get(0);
	}

	@Override
	public BaseClientDetails  getByClientId(String clientId)
	{
		Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.CustomerModel.class.getName()+" "
				+ " where email =:username");
		query.setParameter("username", clientId);
		
		if(null == query || CollectionUtils.isEmpty(query.list()))
		{
			return null;
		}
		
		CustomerModel customer=(CustomerModel) query.list().get(0);
		UserRoleModel userRole=roleDao.getUserRole(customer.getId());
		
		BaseClientDetails details = new BaseClientDetails(customer.getMobile(), "rest_api", "trust,read,write", "password,authorization_code,refresh_token,implicit", userRole == null || userRole.getRole()==null? "ROLE_USER" : userRole.getRole(), "");
        details.setClientSecret(customer.getPassword());
        details.setAccessTokenValiditySeconds(5);
        details.setRefreshTokenValiditySeconds(1000);
        details.setAutoApproveScopes(new ArrayList<>());
		return details;
	}
}
