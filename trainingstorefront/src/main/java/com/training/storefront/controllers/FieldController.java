package com.training.storefront.controllers;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.FieldData;
import com.training.core.model.FieldModel;
import com.training.facade.FieldsFacade;

@Controller
@RequestMapping("/f")
public class FieldController 
{

	@Resource(name = "fieldsFacade")
	private FieldsFacade fieldsFacade;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createField(FieldData fieldData) 
	{
		FieldModel field = new FieldModel();
		field.setName(fieldData.getName());
		fieldsFacade.addField(fieldData);
	}
	
	@RequestMapping(value = "/{fieldId}")
	@ResponseBody
	public FieldData getField(@PathVariable("fieldId")Long id)
	{
		return fieldsFacade.getFieldById(id);
	}
}
