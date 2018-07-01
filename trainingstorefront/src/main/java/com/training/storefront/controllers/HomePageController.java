package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomePageController 
{
	@RequestMapping(method= RequestMethod.GET)
	public String homePage(Model model)
	{
		return "layout/homepage";
	}
}
