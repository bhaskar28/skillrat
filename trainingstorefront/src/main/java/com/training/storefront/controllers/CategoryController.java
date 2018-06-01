package com.training.storefront.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CategoryData;
import com.training.core.model.CategoryModel;
import com.training.core.query.data.CategoryQueryData;
import com.training.core.service.CategoryService;

@Controller
@RequestMapping("/c")
public class CategoryController 
{

	@Resource(name = "categoryService")
	private CategoryService categoryService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createProduct(CategoryData categoryData) {
		System.out.println(categoryData);
		CategoryModel category = new CategoryModel();
		category.setName(categoryData.getName());
		category.setHasSubCategories(categoryData.getHasSubCategories());
		category.setDescription(categoryData.getDescription());
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		category.setCreationTime(date);

		categoryService.saveProduct(category);
	}
	
	@RequestMapping(value = "/pagination-list", method = RequestMethod.POST)
	@ResponseBody
	public void getRootCategories(CategoryQueryData categoryQuery)
	{
		List<CategoryModel> categories=categoryService.getRootCategories(categoryQuery);
		
		List<CategoryData> categoriesData= new ArrayList<CategoryData>();
		
		for(CategoryModel category: categories)
		{
			CategoryData categoryData= new CategoryData();
			categoryData.setId(category.getId());
			categoriesData.add(categoryData);
		}
		
	}
}
