package com.training.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;


public class UserDetailsServiceImpl /*implements UserDetailsService*/
{
	/*@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="customerService")
	private RoleService roleService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		CustomerModel customer= customerService.getCustomerByUserName(username);
		
		if(customer == null)
		{
			
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
*/
}
