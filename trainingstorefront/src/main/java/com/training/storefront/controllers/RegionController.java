package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.RegionData;
import com.training.core.model.RegionModel;
import com.training.core.service.RegionService;

@Controller
@RequestMapping("/reg")
public class RegionController {
	

	@Resource(name="regionService")
	private RegionService regionService;
    
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createRegion(RegionData regionData)
	{
		System.out.println(regionData);
		RegionModel region= new RegionModel();
		region.setCountry(regionData.getCountry());
		region.setId(regionData.getId());
		region.setIsoCode(regionData.getIsoCode());
		region.setIsoWithCountryCode(regionData.getIsoWithCountryCode());;
		region.setName(regionData.getName());
		regionService.saveRegion(region);
}}
