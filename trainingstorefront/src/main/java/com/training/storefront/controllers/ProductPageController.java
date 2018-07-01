package com.training.storefront.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.ProductData;
import com.training.core.query.data.ProductQueryData;
import com.training.facade.ProductFacade;

@Controller
@RequestMapping("/product")
public class ProductPageController 
{
	@Resource(name="productFacade")
	private ProductFacade productFacade;
	
	@RequestMapping(method= RequestMethod.GET)
	public String getProductsForField(Model model,ProductQueryData productQuery)
	{
		if(null != productQuery)
		{
			if(productQuery.getPageSize()<1)
			{
				productQuery.setPageSize(5);
			}
		}
		List<ProductData> products=productFacade.getProducts(productQuery);
		model.addAttribute("products", products);
		return "productlistpage";
	}
}
