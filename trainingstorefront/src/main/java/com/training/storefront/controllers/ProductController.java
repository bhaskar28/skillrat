package com.training.storefront.controllers;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.PriceRowData;
import com.training.core.data.ProductData;
import com.training.core.model.CustomerModel;
import com.training.core.model.FieldModel;
import com.training.core.model.PriceRowModel;
import com.training.core.model.ProductModel;
import com.training.core.service.CurrencyService;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.core.service.PriceRowService;
import com.training.core.service.ProductService;
import com.training.core.util.TrainingDateUtil;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	private static final Logger LOG= Logger.getLogger(ProductController.class);
	
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
		FieldModel field=fieldService.getFieldById(fieldId);
		PriceRowModel priceRow= new PriceRowModel();
		priceRow.setCurrency(currencyService.getCurrencyByISOCode(priceRowData.getCurrencyCode()));
		priceRow.setFixedPrice(priceRowData.getFixedPrice());
		priceRow.setMaximumPrice(priceRowData.getMaximum());
		priceRow.setMinimumPrice(priceRowData.getMinimum());
		
		priceRowService.createPrice(priceRow);
		
		CustomerModel customerModel=customerService.getCustomerById(productData.getCustomerId());
		System.out.println(productData);
		ProductModel product= new ProductModel();
		product.setName(productData.getName());
		product.setDescription(productData.getDescription());
		product.setCreationTime(TrainingDateUtil.getCreationTime());
		product.setPrice(priceRow);
		product.setField(field);
		product.setOwner(customerModel);
		productService.saveProduct(product);
	}
}
