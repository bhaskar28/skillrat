package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.training.core.dao.FieldDao;
import com.training.core.model.FieldModel;
import com.training.core.service.FieldService;

@Service("fieldService")
public class DefaultFieldService implements FieldService
{
	@Resource(name="fieldDao")
	private FieldDao fieldDao;
	
	@Override
	@Transactional
	@CacheEvict(value="fieldsCache", key="#id")
	public void saveField(FieldModel fieldModel) 
	{
		fieldDao.createField(fieldModel);
	}

	@Override
	@Transactional
	@Cacheable(value="fieldsCache", key="#id")
	public FieldModel getFieldById(Long id) 
	{
		return fieldDao.getFieldById(id);
	}
	
}
