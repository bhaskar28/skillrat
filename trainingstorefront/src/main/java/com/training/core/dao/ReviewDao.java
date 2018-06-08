package com.training.core.dao;

import java.util.List;

import com.training.core.model.ReviewModel;

public interface ReviewDao 
{
	void saveReview(ReviewModel reviewModel);
	List<ReviewModel> getCustomerReviews(Long customerId);
}
