package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.RoleDao;
import com.training.core.model.UserRoleModel;
import com.training.core.service.RoleService;

@Service("roleService")
public class DefaultRoleService implements RoleService
{
	@Resource(name="roleDao")
	private RoleDao roleDao;
	
	@Override
	@Transactional
	public void addRole(UserRoleModel userRole) 
	{
		roleDao.addRole(userRole);
	}

}
