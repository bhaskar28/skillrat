package com.training.storefront.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.CustomerData;
import com.training.facade.CustomerFacade;

@Controller
@RequestMapping("/my-account")
public class AccountPageController 
{
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
	
	@RequestMapping(method= RequestMethod.GET)
	public String getAcountPage(Model model, HttpServletRequest request)
	{
		String username=(String) request.getSession().getAttribute("user");
		CustomerData customerData=customerFacade.getCustomerByUsername(username);
		model.addAttribute("customer", customerData);
		return "layout/myaccountpage";
	}
}
