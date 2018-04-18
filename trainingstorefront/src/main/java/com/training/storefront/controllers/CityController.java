package com.training.storefront.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.core.data.CityData;
import com.training.core.model.CityModel;
import com.training.core.service.CityService;

@Controller
@RequestMapping("/city")
public class CityController 
{
	@Resource(name="cityService")
	private CityService cityService;
	
	@RequestMapping("/add")
	public void addCity(CityData cityData)
	{
		CityModel city= new CityModel();
		city.setName(cityData.getName());
		city.setCityIsoCode(cityData.getIsoCode());
		cityService.saveOrupdate(city);
	}
	
	@RequestMapping("/list")
	public List<CityData> getCitiesForRegion(Long regionCode)
	{
		List<CityModel> cities= cityService.getAllCitiesForRegion(regionCode);
		return null;
	}
}
	
