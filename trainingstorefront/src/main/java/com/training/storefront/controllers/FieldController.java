package com.training.storefront.controllers;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.FieldData;
import com.training.core.model.FieldModel;
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
		System.out.println(fieldData);
		FieldModel field = new FieldModel();
		field.setName(fieldData.getName());
		fieldService.saveField(field);
	}
}
