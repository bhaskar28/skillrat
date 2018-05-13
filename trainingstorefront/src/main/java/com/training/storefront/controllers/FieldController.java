package com.training.storefront.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.FieldData;
import com.training.core.model.FieldModel;
import com.training.core.response.data.FieldResponseData;
import com.training.core.service.FieldService;

@Controller
@RequestMapping("/f")
public class FieldController 
{
	@Resource(name = "fieldService")
	private FieldService fieldService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createProduct(FieldData fieldData) 
	{
		FieldModel field = new FieldModel();
		field.setName(fieldData.getName());
		fieldService.saveField(field);
	}
	
	@RequestMapping(value = "/fields", method = RequestMethod.POST)
	@ResponseBody
	public FieldResponseData getFieldsByCategory(Long categoryId)
	{
		FieldResponseData fieldResponse= new FieldResponseData();
		List<FieldModel> fields=fieldService.getFieldsByCategory(categoryId);
		
		List<FieldData> fieldList= new ArrayList<FieldData>();
		fields.forEach(field->{
			FieldData fieldData= new FieldData();
			fieldData.setId(fieldData.getId());
			fieldData.setName(field.getName());
			fieldList.add(fieldData);
		});
		
		fieldResponse.setFields(fieldList);
		return fieldResponse;
	}
}
