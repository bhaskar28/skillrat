package com.training.storefront.validators;

import org.springframework.util.StringUtils;

import com.training.core.data.CustomerData;

public class CustomerValidator 
{
	public static String validate(CustomerData cutsomer)
	{
		if(cutsomer == null)
		{
			return "customer must be null";
		}
		
		if(cutsomer.getMobile() == null && StringUtils.isEmpty(cutsomer.getMobile()))
		{
			return "Not a valid mobile number";
		}
		
		return null;
	}
}
