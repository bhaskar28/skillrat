package com.training.storefront.controllers;


import java.util.ArrayList;
import java.util.List;

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
import com.training.core.query.data.ProductQueryData;
import com.training.core.service.CurrencyService;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.core.service.PriceRowService;
import com.training.core.service.ProductService;
import com.training.core.util.TrainingDateUtil;
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
	
	@RequestMapping(value="/customer-products", method= RequestMethod.GET)
	@ResponseBody
	public List<ProductData> getCustomerProducts(Long customerId)
	{
		List<ProductModel> products=productService.getProductsByCustomer(customerId);
		
		List<ProductData> productsData=convert(products);
		return productsData;
	}
	
	@RequestMapping(value="/customer-products", method= RequestMethod.POST)
	@ResponseBody
	public List<ProductData> getCustomerProducts(ProductQueryData productQuery)
	{
		List<ProductModel> products=productService.getProductsByCustomer(productQuery);
		
		List<ProductData> productsData=convert(products);
		return productsData;
	}

	private List<ProductData> convert(List<ProductModel> products) 
	{
		List<ProductData> productsList= new ArrayList<ProductData>();
		for(ProductModel product: products)
		{
			PriceRowModel priceRowModel= product.getPrice();
			PriceRowData priceRow= new PriceRowData();
			ProductData productData= new ProductData();
			if(priceRowModel != null)
			{
				priceRow.setCurrencyCode(priceRowModel.getCurrency().getIsoCode());
				priceRow.setFixedPrice(priceRowModel.getFixedPrice());
				priceRow.setMaximum(priceRowModel.getMaximumPrice());
				priceRow.setMinimum(priceRowModel.getMinimumPrice());
				priceRow.setId(priceRowModel.getId());
				productData.setPriceRow(priceRow);
			}
			
			productData.setDescription(productData.getDescription());
			productData.setName(productData.getName());
			productData.setPriceRow(priceRow);
			productsList.add(productData);
		}
		return productsList;
	}
	
}
