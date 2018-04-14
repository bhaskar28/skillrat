package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/follow")
public class FollowController 
{
	@RequestMapping("/list")
	@ResponseBody
	public String getFollowers()
	{
		return "follow";
	}
}
