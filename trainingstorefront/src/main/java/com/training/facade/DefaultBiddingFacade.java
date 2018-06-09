package com.training.facade;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.BiddingData;
import com.training.core.data.CustomerData;
import com.training.core.data.ProductData;
import com.training.core.model.BiddingModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.ProductModel;
import com.training.core.service.BiddingService;
import com.training.core.service.CustomerService;
import com.training.core.service.ProductService;

@Component("biddingFacade")
public class DefaultBiddingFacade implements BiddingFacade
{
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
	@Resource(name="biddingService")
	private BiddingService biddingService;
	
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="productService")
	private ProductService productService;
	
	@Resource(name="productFacade")
	private ProductFacade productFacade;
	
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

	@Override
	public List<BiddingData> getCustomerBiddings(Long customerId) 
	{
		List<BiddingModel> biddings= biddingService.getCustomerBiddings(customerId);
		
		return convert(biddings);
	}

	private List<BiddingData> convert(List<BiddingModel> biddings) 
	{
		List<BiddingData> biddingsData= new ArrayList<BiddingData>();
		for(BiddingModel biddingModel: biddings)
		{
			BiddingData biddingData= new BiddingData();
			biddingData.setId(biddingData.getCustomerId());
			biddingData.setBidPrice(biddingModel.getPrice());
			biddingData.setDescription(biddingModel.getDescription());
			ProductData productData=productFacade.getProductById(biddingModel.getProduct().getId());
			CustomerData customerData= customerFacade.getCustomerById(biddingModel.getCustomer().getId());
			biddingData.setProductData(productData);
			biddingData.setCustomerData(customerData);
			biddingsData.add(biddingData);
		}
		return biddingsData;
	}

	@Override
	public List<BiddingData> getProductBiddings(Long productId) 
	{
		List<BiddingModel> biddings= biddingService.getProductBiddings(productId);
		return convert(biddings);
	}

}
