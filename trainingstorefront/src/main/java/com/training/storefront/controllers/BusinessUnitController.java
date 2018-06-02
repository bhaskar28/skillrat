package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.BusinessData;
import com.training.core.model.BusinessUnitModel;
import com.training.core.service.BusinessService;

@Controller
@RequestMapping("/business")
public class BusinessUnitController 
{
	
	@Resource(name="businessService")
	private BusinessService businessService;
    
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createBusiness(BusinessData businessData)
	{
		System.out.println(businessData);
		BusinessUnitModel business= new BusinessUnitModel();
		business.setDescription(businessData.getDescription());
		business.setEmail(businessData.getEmail());
		business.setName(businessData.getName());
		business.setId(businessData.getId());
		businessService.saveBusiness(business);	
	}
	
}
