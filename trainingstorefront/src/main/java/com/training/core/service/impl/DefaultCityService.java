package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.model.CityModel;
import com.training.core.service.CityService;

@Service("cityService")
public class DefaultCityService implements CityService
{
	@Resource(name="cityService")
	private CityService cityService;
	
	@Override
	@Transactional
	public void saveOrupdate(CityModel city) 
	{
		cityService.saveOrupdate(city);
	}

	@Override
	public List<CityModel> getCitiesForCountryId(Long id) 
	{
		return cityService.getAllCitiesForCountryId(id);
	}

	@Override
	public List<CityModel> getAllCitiesForCountryId(Long id) 
	{
		return cityService.getAllCitiesForCountryId(id);
	}
	
}
