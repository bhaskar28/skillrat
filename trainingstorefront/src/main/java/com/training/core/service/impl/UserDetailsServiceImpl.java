package com.training.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.training.core.data.UserData;
import com.training.core.model.CustomerModel;
import com.training.core.model.UserRoleModel;
import com.training.core.service.CustomerService;
import com.training.core.service.RoleService;


public class UserDetailsServiceImpl implements UserDetailsService
{
	private static Logger LOG= Logger.getLogger(UserDetailsServiceImpl.class);
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="customerService")
	private RoleService roleService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		CustomerModel customer= customerService.getCustomerByUserName(username);
		
		if(customer == null)
		{
			LOG.info("User not found with username: "+username);
			return null;
		}
		UserRoleModel userRoleModel=roleService.getRoleByCustomer(customer.getId());
		return new UserData(customer.getMobile(), customer.getPassword(), createGrantedAuthorities(userRoleModel));
	}
	
	protected List<GrantedAuthority> createGrantedAuthorities(UserRoleModel userRoleModel) 
	{
        boolean roleUserFound = false;

        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        grantedAuthorities.add(new SimpleGrantedAuthority(userRoleModel.getRole()));
        if (userRoleModel.getRole().equals("ROLE_USER")) 
        {
            roleUserFound = true;
        }
        
        if (!roleUserFound)
        {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        return grantedAuthorities;
    }

}
