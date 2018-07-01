package com.training.storefront.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layout")
public class LayoutController 
{
	@RequestMapping(value="/header")
	public String getHeader(Model model, HttpServletRequest request)
	{
		boolean login=false;
		String username=(String)request.getSession().getAttribute("user");
		if(null !=username)
		{
			login= true;
		}
		model.addAttribute("login", login);
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
