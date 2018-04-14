package com.training.core.service;

import com.training.core.model.UserRoleModel;

public interface RoleService 
{
	void addRole(UserRoleModel userRole);
	UserRoleModel getRoleByCustomer(Long customerId);
}
