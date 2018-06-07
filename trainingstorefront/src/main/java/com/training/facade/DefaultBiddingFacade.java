package com.training.facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.BiddingData;
import com.training.core.model.BiddingModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.ProductModel;
import com.training.core.service.BiddingService;
import com.training.core.service.CustomerService;
import com.training.core.service.ProductService;

@Component("biddingFacade")
public class DefaultBiddingFacade implements BiddingFacade
{
	@Resource(name="biddingService")
	private BiddingService biddingService;
	
	@Resource(name="biddingService")
	private CustomerService customerService;
	
	@Resource(name="biddingService")
	private ProductService productService;
	
	@Override
	public BiddingData createBid(BiddingData biddingData) 
	{
		CustomerModel customerModel=customerService.getCustomerById(biddingData.getCustomerId());
		ProductModel product=productService.getProductById(biddingData.getProductId());
		BiddingModel bidding= new BiddingModel();
		bidding.setDescription(biddingData.getDescription());
		bidding.setCustomer(customerModel);
		bidding.setProduct(product);
		bidding.setPrice(biddingData.getBidPrice());
		return biddingData;
	}

}
