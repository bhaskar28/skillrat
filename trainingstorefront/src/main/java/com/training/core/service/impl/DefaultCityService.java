package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.CityDao;
import com.training.core.model.CityModel;
import com.training.core.service.CityService;

@Service("cityService")
public class DefaultCityService implements CityService
{
	@Resource(name="cityDao")
	private CityDao cityDao;
	
	@Override
	@Transactional
	public void saveOrupdate(CityModel city) 
	{
		cityDao.saveOrupdate(city);
	}


	@Override
	@Transactional
	public List<CityModel> getAllCitiesForRegion(Long regionCode) 
	{
		return cityDao.getAllCitiesForRegion(regionCode);
	}
	
}
