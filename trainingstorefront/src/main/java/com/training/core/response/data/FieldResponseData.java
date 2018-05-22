package com.training.core.response.data;

import java.util.List;

import com.training.core.data.FieldData;

public class FieldResponseData extends ResponseData
{
	private FieldData fieldData;
	private List<FieldData> fields;
	public FieldData getFieldData() {
		return fieldData;
	}
	public void setFieldData(FieldData fieldData) {
		this.fieldData = fieldData;
	}
	public List<FieldData> getFields() {
		return fields;
	}
	public void setFields(List<FieldData> fields) {
		this.fields = fields;
	}
}
