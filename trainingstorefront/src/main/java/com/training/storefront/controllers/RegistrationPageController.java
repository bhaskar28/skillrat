package com.training.storefront.controllers;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.CustomerData;
import com.training.facade.CustomerFacade;

@Controller
@RequestMapping("/register")
public class RegistrationPageController
{
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
	@RequestMapping(method= RequestMethod.GET)
	public String registerPage(Model model)
	{
		return "layout/registerpage";
	}
	
	@RequestMapping(method= RequestMethod.POST)
	public String register(Model model, CustomerData customerData)
	{
		customerFacade.createCustomer(customerData);
		return "redirect:/home";
	}
}
