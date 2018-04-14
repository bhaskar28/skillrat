package com.training.storefront.validators;

import com.training.core.data.RegionData;

public class RegionValidator 
{
	public static String validate(RegionData regionData)
	{
		if(regionData.getCountryId() == null)
		{
			return "No country selected";
		}
		
		if(regionData.getIsoCode() == null)
		{
			return "Provide iso code";
		}
		
		if(regionData.getIsoWithCountryCode() == null)
		{
			return "Provide iso code with country iso code";
		}
		
		if(regionData.getName() == null)
		{
			return "Give a name to the region";
		}
		
		return "";
	}
}
