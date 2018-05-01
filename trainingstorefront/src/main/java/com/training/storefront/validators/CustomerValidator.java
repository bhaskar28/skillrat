package com.training.storefront.validators;

import org.springframework.util.StringUtils;

import com.training.core.data.CustomerData;

public class CustomerValidator 
{
	public static String validate(CustomerData cutsomer)
	{
		if(cutsomer == null)
		{
			return "customer must not be null";
		}
		
		if(StringUtils.isEmpty(cutsomer.getMobile()))
		{
			return "Not a valid mobile number";
		}
		
		if(StringUtils.isEmpty(cutsomer.getEmail()))
		{
			return "Please enter valid email";
		}
		
		if(StringUtils.isEmpty(cutsomer.getFirstName()))
		{
			return "First name should not be null";
		}
		
		if(StringUtils.isEmpty(cutsomer.getLastName()))
		{
			return "Last name should not be null";
		}
		
		return null;
	}
}
