package com.training.storefront.controllers;

import java.util.ArrayList;
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
import com.training.facade.CategoryFacade;

@Controller
@RequestMapping("/c")
public class CategoryController 
{
	@Resource(name = "categoryFacade")
	private CategoryFacade categoryFacade;
	
	@Resource(name = "categoryService")
	private CategoryService categoryService;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	@ResponseBody
	public void createProduct(CategoryData categoryData) 
	{
		CategoryModel category = new CategoryModel();
		category.setName(categoryData.getName());
		category.setHasSubCategories(categoryData.getHasSubCategories());
		category.setHasSuperCategories(categoryData.getHasSupCategories());
		category.setDescription(categoryData.getDescription());
		categoryService.saveProduct(category);
	}
	
	@RequestMapping(value = "/pagination-list", method = RequestMethod.POST)
	@ResponseBody
	public List<CategoryData> getRootCategories(CategoryQueryData categoryQuery)
	{
		List<CategoryData> categoriesData=categoryFacade.getCategories(categoryQuery);
		return categoriesData;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	@ResponseBody
	public List<CategoryData> getRootCategories()
	{
		List<CategoryModel> categories=categoryService.getRootCategories();
		
		List<CategoryData> categoriesData = convert(categories);
		return categoriesData;
	}

	private List<CategoryData> convert(List<CategoryModel> categories) 
	{
		List<CategoryData> categoriesData= new ArrayList<CategoryData>();
		
		for(CategoryModel category: categories)
		{
			CategoryData categoryData= new CategoryData();
			categoryData.setId(category.getId());
			categoriesData.add(categoryData);
		}
		return categoriesData;
	}
}
