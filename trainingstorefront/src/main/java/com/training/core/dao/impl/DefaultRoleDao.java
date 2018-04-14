package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.training.core.dao.RoleDao;
import com.training.core.model.UserRoleModel;

@Repository("roleDao")
public class DefaultRoleDao implements RoleDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void addRole(UserRoleModel userRole) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(userRole);
	}

	@Override
	public UserRoleModel getUserRole(Long userId) 
	{
		Query query= sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.UserRoleModel.class.getName()+" "
				+ "Where customer.id =:userId");
		query.setParameter("userId", userId);
		
		if(null != query.list() && !CollectionUtils.isEmpty(query.list()))
		{
			query.list().get(0);
		}
		return null;
	}

}
