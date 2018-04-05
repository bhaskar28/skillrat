package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/f")
public class FollowController 
{
	// We didnt mentioned any this here. So as i told by default it will take it as a get.
	//as u can see we are able to access this on browser and get the follow string on browser
	// got it?yes
	@RequestMapping("/g")
	@ResponseBody
	public String getFollowers()
	{
		return "follow";
	}
}
