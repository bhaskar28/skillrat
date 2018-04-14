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
	// this productService is given on ProductService implementation class. This should same as we given at
	// DefaultProductService class. If we change that name. We should change here also
	@Resource(name="productService")
	private ProductService productService;
	
	//we cant access post method on browser-see here post is to post the value and diplay the values in url rite 
	//that is possible through tomcat so how u can say that cant access post?
	// post methods can only access through forms or web service tools. get methods can access from url
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createProduct(ProductData productData)//product data lo data ela chudali..textm  mental dhana agthuava chepthunnanu love u thank u
	{
		System.out.println(productData);
		ProductModel product= new ProductModel();
		product.setName(productData.getName());
		product.setPrice(productData.getPrice());
		product.setDescription(productData.getDescription());
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		product.setCreationTime(date);

		productService.saveProduct(product);
	}
}
