package com.training.core.dao;

import com.training.core.model.FieldModel;

public interface FieldDao 
{
	void createField(FieldModel field);
	FieldModel getFieldById(Long id);
}