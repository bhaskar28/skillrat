package com.training.webservices.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.training.core.data.CountryData;
import com.training.core.model.CountryModel;
import com.training.core.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController 
{
	@Resource(name = "countryService")
	private CountryService countryService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createCountry(CountryData countryData) 
	{
		System.out.println(countryData);
		CountryModel country = new CountryModel();
		country.setId(countryData.getId());
		country.setIsoCode(countryData.getIsoCode());
		country.setName(countryData.getName());
		countryService.saveCountry(country);
	}
}
