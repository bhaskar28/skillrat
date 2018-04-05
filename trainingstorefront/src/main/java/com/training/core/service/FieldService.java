package com.training.core.service;

import com.training.core.model.FieldModel;

public interface FieldService 
{
	void saveField(FieldModel fieldModel);
	FieldModel getFieldById(Long id);
}
