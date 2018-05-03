package com.training.storefront.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.ProductData;
import com.training.core.model.ProductModel;
import com.training.core.service.ProductService;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	@Resource(name="productService")
	private ProductService productService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createProduct(ProductData productData)
	{
		System.out.println(productData);
		ProductModel product= new ProductModel();
		product.setName(productData.getName());
		product.setDescription(productData.getDescription());
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		product.setCreationTime(date);

		productService.saveProduct(product);
	}
}
