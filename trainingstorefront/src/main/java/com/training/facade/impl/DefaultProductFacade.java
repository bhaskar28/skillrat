package com.training.facade.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.FieldData;
import com.training.core.data.PriceRowData;
import com.training.core.data.ProductData;
import com.training.core.model.CategoryModel;
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
import com.training.core.util.TrainingDateUtil;
import com.training.facade.CategoryFacade;
import com.training.facade.FieldsFacade;
import com.training.facade.PriceRowFacade;
import com.training.facade.ProductFacade;

@Component("productFacade")
public class DefaultProductFacade implements ProductFacade
{
	@Resource(name="fieldsFacade")
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
	
	@Resource(name="priceRowFacade")
	private PriceRowFacade priceRowFacade;
	
	@Override
	public void saveProduct(ProductData productData) 
	{
		CustomerModel customerModel= customerService.getCustomerById(productData.getCustomerId());
		FieldModel field= fieldService.getFieldById(productData.getFieldId());
		CategoryModel category= categoryService.getCategoryById(productData.getCategoryId());
		PriceRowData priceRowData= productData.getPriceRow();
		
		PriceRowModel priceRow=priceRowFacade.createPriceRow(priceRowData);
		
		ProductModel productModel= new ProductModel();
		productModel.setName(productData.getName());
		productModel.setDescription(productData.getDescription());
		productModel.setOwner(customerModel);
		productModel.setField(field);
		productModel.setCategory(category);
		productModel.setPrice(priceRow);
		productModel.setCreationTime(TrainingDateUtil.getCreationTime());
		productService.saveProduct(productModel);
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
		List<ProductModel> products=productService.getProductsByCustomer(productQuery);
		List<ProductData> productsData= convert(products);
		return productsData;
	}

	@Override
	public List<ProductData> getProductsByCustomer(Long customerId) 
	{
		List<ProductModel> products=productService.getProductsByCustomer(customerId);
		List<ProductData> productsData= convert(products);
		return productsData;
	}

	private List<ProductData> convert(List<ProductModel> products) 
	{
		List<ProductData> productsList= new ArrayList<ProductData>();
		for(ProductModel product: products)
		{
			PriceRowData priceRow= new PriceRowData();
			ProductData productData= new ProductData();
			productData.setDescription(product.getDescription());
			productData.setName(product.getName());
			productData.setPriceRow(priceRow);
			productsList.add(productData);
		}
		return productsList;
	}

	@Override
	public List<ProductData> getProducts(ProductQueryData productQuery) 
	{
		List<ProductModel> products=productService.getProducts(productQuery);
		List<ProductData> productsData= convert(products);
		return productsData;
	}
}
