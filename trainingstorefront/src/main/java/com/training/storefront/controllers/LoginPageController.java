package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginPageController 
{
	@RequestMapping(method=RequestMethod.GET)
	public String getLoginPage(Model model, @RequestParam(value = "error", defaultValue = "false") boolean loginError)
	{
		
		return "layout/loginpage";
	}
}
