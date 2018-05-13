package com.training.storefront.controllers;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.BiddingData;
import com.training.core.model.BiddingModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.ProductModel;
import com.training.core.service.BiddingService;
import com.training.core.service.CustomerService;
import com.training.core.service.ProductService;

@Controller
@RequestMapping("/bidding")
public class BiddingController {
	
	@Resource(name="biddingService")
	private BiddingService biddingService;
    
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="productService")
	private ProductService productService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createBidding(BiddingData biddingData)
	{
		CustomerModel customer=customerService.getCustomerById(biddingData.getCustomerId());
		ProductModel product= productService.getProductById(biddingData.getProductId());
		System.out.println(biddingData);
		BiddingModel bidding= new BiddingModel();
		bidding.setDescription(biddingData.getDescription());
		bidding.setPrice(biddingData.getBidPrice());
		bidding.setProduct(product);
		bidding.setCustomer(customer);
		biddingService.saveBidding(bidding);
	}

}
