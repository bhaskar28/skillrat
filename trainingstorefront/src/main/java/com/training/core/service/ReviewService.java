package com.training.core.service;

import java.util.List;

import com.training.core.model.ReviewModel;

public interface ReviewService 
{
	void saveReview(ReviewModel reviewModel);
	List<ReviewModel> getCustomerReviews(Long customerId);
}
