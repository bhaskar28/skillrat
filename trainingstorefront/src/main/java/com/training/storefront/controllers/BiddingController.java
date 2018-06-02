package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.BiddingData;
import com.training.core.model.BiddingModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.ProductModel;
import com.training.core.service.BiddingService;
import com.training.core.service.CustomerService;
import com.training.core.service.ProductService;

@Controller
@RequestMapping("/bidding")
public class BiddingController 
{
	@Resource(name="productService")
	private ProductService productService;
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="biddingService")
	private BiddingService biddingService;
	
	@RequestMapping(value="/place", method= RequestMethod.POST)
	public void placeBid(BiddingData biddingData)
	{
		ProductModel product=productService.getProductById(biddingData.getProductId());
		CustomerModel customer=customerService.getCustomerById(biddingData.getCustomerId());
		BiddingModel bidding= new BiddingModel();
		bidding.setDescription(biddingData.getDescription());
		bidding.setPrice(biddingData.getBidPrice());
		bidding.setProduct(product);
		bidding.setCustomer(customer);
		biddingService.saveBidding(bidding);
	}
}
