package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.RoleData;
import com.training.core.model.CustomerModel;
import com.training.core.model.UserRoleModel;
import com.training.core.service.CustomerService;
import com.training.core.service.RoleService;

@Controller
@RequestMapping("/role")
public class RolesController 
{
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="roleService")
	private RoleService roleService;
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public void addRole(RoleData roleData)
	{
		CustomerModel customer=customerService.getCustomerById(roleData.getCustomerId());
		UserRoleModel roleModel= new UserRoleModel();
		roleModel.setCustomer(customer);
		roleModel.setRole(roleData.getRole());
		roleModel.setCustomer(customer);
		roleService.addRole(roleModel);
	}
}
