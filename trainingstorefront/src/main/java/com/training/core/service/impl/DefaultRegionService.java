package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.training.core.dao.RegionDao;
import com.training.core.model.RegionModel;
import com.training.core.service.RegionService;
@Service("regionService")
public class DefaultRegionService implements RegionService{
	@Resource(name="regionDao")
	private RegionDao regionDao;
	@Override
	@Transactional
	public void saveRegion(RegionModel regionModel) {
		regionDao.createRegion(regionModel);
		
	}

}
