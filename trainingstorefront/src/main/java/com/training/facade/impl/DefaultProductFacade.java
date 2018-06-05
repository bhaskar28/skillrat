package com.training.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.FieldData;
import com.training.core.data.PriceRowData;
import com.training.core.data.ProductData;
import com.training.core.model.CategoryModel;
import com.training.core.model.CurrencyModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.FieldModel;
import com.training.core.model.PriceRowModel;
import com.training.core.model.ProductModel;
import com.training.core.query.data.ProductQueryData;
import com.training.core.service.CategoryService;
import com.training.core.service.CurrencyService;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.core.service.PriceRowService;
import com.training.core.service.ProductService;
import com.training.facade.CategoryFacade;
import com.training.facade.FieldsFacade;
import com.training.facade.ProductFacade;

@Component
public class DefaultProductFacade implements ProductFacade
{
	@Resource(name="fieldFacade")
	private FieldsFacade fieldFacade;
	
	@Resource(name="categoryFacade")
	private CategoryFacade categoryFacade;
	
	@Resource(name="productService")
	private ProductService productService;
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="fieldService")
	private FieldService fieldService;
	
	@Resource(name="categoryService")
	private CategoryService categoryService;
	
	@Resource(name="priceRowService")
	private PriceRowService priceRowService;
	
	@Resource(name="currencyService")
	private CurrencyService currencyService;
	
	@Override
	public void saveProduct(ProductData productData) 
	{
		CustomerModel customerModel= customerService.getCustomerById(productData.getCustomerId());
		FieldModel field= fieldService.getFieldById(productData.getFieldId());
		CategoryModel category= categoryService.getCategoryById(productData.getCategoryId());
		PriceRowData priceRowData= productData.getPriceRow();
		CurrencyModel currencyModel=currencyService.getCurrencyByISOCode(priceRowData.getCurrencyCode());
		
		PriceRowModel priceRow= new PriceRowModel();
		priceRow.setFixedPrice(priceRowData.getFixedPrice());
		priceRow.setMaximumPrice(priceRowData.getMaximum());
		priceRow.setMinimumPrice(priceRowData.getMinimum());
		priceRow.setCurrency(currencyModel);
		priceRowService.createPrice(priceRow);
		
		
		ProductModel productModel= new ProductModel();
		productModel.setName(productData.getName());
		productModel.setDescription(productData.getDescription());
		productModel.setOwner(customerModel);
		productModel.setField(field);
		productModel.setCategory(category);
		productModel.setPrice(priceRow);
	}

	@Override
	public ProductData getProductById(Long productId) 
	{
		ProductModel productModel=productService.getProductById(productId);
		FieldData fieldData=fieldFacade.getFieldById(productModel.getField().getId());
				
		ProductData productData= new ProductData();
		productData.setDescription(productModel.getDescription());
		productData.setName(productModel.getName());
		productData.setFieldData(fieldData);
		
		return productData;
	}

	@Override
	public List<ProductData> getProductsByCustomer(ProductQueryData productQuery) 
	{
		return null;
	}

	@Override
	public List<ProductData> getProductsByCustomer(Long customerId) 
	{
		return null;
	}

}
