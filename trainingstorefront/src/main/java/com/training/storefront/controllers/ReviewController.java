package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.ReviewData;
import com.training.core.model.CustomerModel;
import com.training.core.model.ReviewModel;
import com.training.core.service.CustomerService;
import com.training.core.service.ReviewService;

@Controller
@RequestMapping("/r")
public class ReviewController 
{
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="reviewService")
	private ReviewService reviewService;
	
	@RequestMapping(value="/add-review", method= RequestMethod.POST)
	@ResponseBody
	public void addReview(ReviewData reviewData)
	{
		ReviewModel review= new ReviewModel();
		review.setComment(reviewData.getComment());
		review.setRating(reviewData.getRating());
		CustomerModel customer=customerService.getCustomerById(reviewData.getCustomerId());
		CustomerModel givenBy=customerService.getCustomerById(reviewData.getGivenByCustomer());
		review.setCustomer(customer);
		review.setGivenBy(givenBy);
		reviewService.saveReview(review);
	}
}
