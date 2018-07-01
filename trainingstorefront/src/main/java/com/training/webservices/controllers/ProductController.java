package com.training.webservices.controllers;


import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.PriceRowData;
import com.training.core.data.ProductData;
import com.training.core.query.data.ProductQueryData;
import com.training.core.service.CurrencyService;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.core.service.PriceRowService;
import com.training.core.service.ProductService;
import com.training.facade.ProductFacade;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	private static final Logger LOG= Logger.getLogger(ProductController.class);

	@Resource(name="productFacade")
	private ProductFacade productFacade;
	
	@Resource(name="productService")
	private ProductService productService;
	
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	@Resource(name="priceRowService")
	private PriceRowService priceRowService;
	
	@Resource(name="fieldService")
	private FieldService fieldService;
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createProduct(ProductData productData, PriceRowData priceRowData, Long fieldId)
	{
		productData.setPriceRow(priceRowData);
		productFacade.saveProduct(productData);
	}
	
	@RequestMapping(value="/customer/{customerId}", method= RequestMethod.POST)
	@ResponseBody
	public List<ProductData> getCustomerProducts(@PathVariable("customerId")Long customerId)
	{
		List<ProductData> products=productFacade.getProductsByCustomer(customerId);
		return products;
	}
	
	@RequestMapping(value="/customer-products", method= RequestMethod.POST)
	@ResponseBody
	public List<ProductData> getCustomerProducts(ProductQueryData productQuery)
	{
		List<ProductData> products=productFacade.getProductsByCustomer(productQuery);
		return products;
	}

	public String getProductsForCategory()
	{
		return null;
	}
}
