package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController 
{
	@RequestMapping(value="/header")
	public String getHeader(Model model)
	{
		return "common/header";
	}
	
	@RequestMapping(value="/footer")
	public String getFooter(Model model)
	{
		return "common/footer";
	}
	
	public String getStatic(Model model)
	{
		return "common/static";
	}
}
