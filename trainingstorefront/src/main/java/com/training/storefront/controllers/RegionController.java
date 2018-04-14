package com.training.storefront.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.RegionData;
import com.training.core.model.CountryModel;
import com.training.core.model.RegionModel;
import com.training.core.service.CountryService;
import com.training.core.service.RegionService;

@Controller
@RequestMapping("/region")
public class RegionController 
{
	@Resource(name="regionService")
	private RegionService regionService;
    
	@Resource(name="regionService")
	private CountryService countryService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createRegion(RegionData regionData)
	{
		
		CountryModel country=countryService.getCountry(regionData.getCountryId());
		System.out.println(regionData);
		RegionModel region= new RegionModel();
		region.setCountry(country);
		region.setId(regionData.getId());
		region.setIsoCode(regionData.getIsoCode());
		region.setIsoWithCountryCode(regionData.getIsoWithCountryCode());;
		region.setName(regionData.getName());
		regionService.saveRegion(region);
	}
	
	@RequestMapping(value="/country-regions", method= RequestMethod.POST)
	public List<RegionData> getRegionsForCountry(Long countryId)
	{
		List<RegionModel> regions=regionService.getRegionsForCountry(countryId);
		return null;
	}
}
