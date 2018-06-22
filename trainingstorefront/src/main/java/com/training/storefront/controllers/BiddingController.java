package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.BiddingData;
import com.training.core.query.data.PaginationData;
import com.training.core.service.BiddingService;
import com.training.core.service.CustomerService;
import com.training.core.service.ProductService;
import com.training.facade.BiddingFacade;

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
	
	@Resource(name="biddingFacade")
	private BiddingFacade biddingFacade;
	
	@RequestMapping(value="/place", method= RequestMethod.POST)
	public BiddingData placeBid(BiddingData biddingData)
	{
		BiddingData bidding=biddingFacade.createBid(biddingData);
		return bidding;
	}
	
	@RequestMapping(value="/customer-biddings", method= RequestMethod.POST)
	public void getBiddingsForCustomer(PaginationData pagination, Long customerId)
	{
		biddingFacade.getCustomerBiddings(customerId);
	}
}
