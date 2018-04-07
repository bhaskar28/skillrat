package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

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

}
