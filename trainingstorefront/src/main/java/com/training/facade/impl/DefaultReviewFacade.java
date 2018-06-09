package com.training.facade.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.training.core.data.CustomerData;
import com.training.core.data.ReviewData;
import com.training.core.model.ReviewModel;
import com.training.core.service.ReviewService;
import com.training.facade.CustomerFacade;
import com.training.facade.ReviewFacade;

@Service("reviewFacade")
public class DefaultReviewFacade implements ReviewFacade
{
	@Resource(name="reviewService")
	private ReviewService reviewService;
	
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
	@Override
	public ReviewData addReview(ReviewData reviewData) 
	{
		return null;
	}

	@Override
	public List<ReviewData> getCustomerReviews(Long customerId) 
	{
		List<ReviewModel> reviews=reviewService.getCustomerReviews(customerId);
		List<ReviewData> reviewsData = convert(reviews);
		return reviewsData;
	}

	private List<ReviewData> convert(List<ReviewModel> reviews) 
	{
		List<ReviewData> reviewsData= new ArrayList<ReviewData>();
		
		for(ReviewModel reviewModel: reviews)
		{
			CustomerData customerData=customerFacade.getCustomerById(reviewModel.getGivenBy().getId());
			ReviewData reviewData= new ReviewData();
			reviewData.setId(reviewModel.getId());
			reviewData.setComment(reviewModel.getComment());
			reviewData.setRating(reviewModel.getRating());
			reviewData.setGivenBy(customerData);
			reviewsData.add(reviewData);
		}
		return reviewsData;
	}
	
}
