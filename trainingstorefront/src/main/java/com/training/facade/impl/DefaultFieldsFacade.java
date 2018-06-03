package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.FieldData;
import com.training.core.model.FieldModel;
import com.training.core.service.FieldService;
import com.training.facade.FieldsFacade;

@Component("fieldsFacade")
public class DefaultFieldsFacade implements FieldsFacade
{
	@Resource(name="fieldService")
	private FieldService fieldService;
	
	@Override
	public void addField(FieldData fieldData)
	{
		FieldModel field = new FieldModel();
		field.setName(fieldData.getName());
		fieldService.saveField(field);
	}
	
	@Override
	public FieldData getFieldById(Long fieldId) 
	{
		FieldModel fieldModel=fieldService.getFieldById(fieldId);
		FieldData fieldData= new FieldData();
		fieldData.setId(fieldModel.getId());
		fieldData.setName(fieldModel.getName());
		return fieldData;
	}
	
}
