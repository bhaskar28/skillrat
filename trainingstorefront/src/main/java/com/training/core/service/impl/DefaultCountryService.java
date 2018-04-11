package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.training.core.dao.CountryDao;
import com.training.core.model.CountryModel;
import com.training.core.service.CountryService;

@Service("countryService")
public class DefaultCountryService  implements CountryService{
	@Resource(name="countryDao")
	private CountryDao countryDao;

	@Override
	@Transactional
	public void saveCountry(CountryModel countryModel) {
		countryDao.createCountry(countryModel);
		
	}

}
