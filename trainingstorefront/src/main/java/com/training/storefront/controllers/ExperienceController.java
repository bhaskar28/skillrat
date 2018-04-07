package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.ExperienceData;
import com.training.core.model.CustomerModel;
import com.training.core.model.ExperienceModel;
import com.training.core.service.CustomerService;
import com.training.core.service.ExperienceService;

@Controller
@RequestMapping("/experience")
public class ExperienceController 
{
	@Resource(name = "experienceService")
	private ExperienceService experienceService;

	@Resource(name = "customerService")
	private CustomerService customerService;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createExperience(ExperienceData experienceData) 
	{
		System.out.println(experienceData);
		ExperienceModel experience = new ExperienceModel();
		experience.setYears(experienceData.getYears());
		experience.setMonths(experienceData.getMonths());
		experience.setSummary(experienceData.getSummary());
		CustomerModel customer=customerService.getCustomerById(experienceData.getCustomerId());
		experience.setCustomer(customer);
		experienceService.saveExperience(experience);
	}

}
