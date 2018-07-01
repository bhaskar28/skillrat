package com.training.storefront.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler
{
	
	public LogoutSuccessHandler(String defaultTargetURL) 
	{
	   this.setDefaultTargetUrl(defaultTargetURL);
	}
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException 
	{
		request.getSession().setAttribute("user", null);
	   super.onLogoutSuccess(request, response, authentication);
	}
}
