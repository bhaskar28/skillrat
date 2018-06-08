package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.training.core.dao.RegionDao;
import com.training.core.model.RegionModel;
import com.training.core.service.RegionService;

@Service("regionService")
public class DefaultRegionService implements RegionService
{
	@Resource(name="regionDao")
	private RegionDao regionDao;
	
	@Override
	@Transactional
	public void saveRegion(RegionModel regionModel) 
	{
		regionDao.createRegion(regionModel);
	}

	@Override
	@Transactional
	public RegionModel getRegionById(Long id) 
	{
		return regionDao.getRegionById(id);
	}

	@Override
	@Transactional
	public List<RegionModel> getRegionsForCountry(Long countryId) 
	{
		return regionDao.getRegionsForCountry(countryId);
	}
	
}
