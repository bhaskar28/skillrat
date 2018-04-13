package com.training.core.dao;

import com.training.core.model.UserRoleModel;

public interface RoleDao 
{
	void addRole(UserRoleModel userRole);
	UserRoleModel getUserRole(Long userId);
}
