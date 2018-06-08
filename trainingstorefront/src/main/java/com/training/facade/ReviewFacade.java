package com.training.facade;

import java.util.List;

import com.training.core.data.ReviewData;

public interface ReviewFacade
{
	ReviewData addReview(ReviewData reviewData);
	List<ReviewData> getCustomerReviews(Long customerId);
}
