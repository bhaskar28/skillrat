package com.training.facade;

import com.training.core.data.FieldData;

public interface FieldsFacade 
{
	FieldData getFieldById(Long fieldId);
	public void addField(FieldData fieldData);
}
