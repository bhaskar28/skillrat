package com.training.storefront.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.ProductData;
import com.training.core.model.PriceRowModel;
import com.training.core.model.ProductModel;
import com.training.core.service.CurrencyService;
import com.training.core.service.ProductService;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	private static final Logger LOG= Logger.getLogger(ProductController.class);
	
	@Resource(name="productService")
	private ProductService productService;
	
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createProduct(ProductData productData)
	{
		PriceRowModel priceRow= new PriceRowModel();
		priceRow.setCurrency(currencyService.getCurrencyByISOCode(productData.getPriceRow().getCurrencyCode()));
		priceRow.setFixedPrice(productData.getPriceRow().getFixedPrice());
		priceRow.setMaximumPrice(productData.getPriceRow().getMaximum());
		priceRow.setMinimumPrice(productData.getPriceRow().getMinimum());
		
		System.out.println(productData);
		ProductModel product= new ProductModel();
		product.setName(productData.getName());
		product.setDescription(productData.getDescription());
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		product.setCreationTime(date);
		product.setPrice(priceRow);
		productService.saveProduct(product);
	}
}
