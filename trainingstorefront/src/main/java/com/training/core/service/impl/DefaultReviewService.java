package com.training.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.ReviewDao;
import com.training.core.data.ReviewData;
import com.training.core.model.ReviewModel;
import com.training.core.service.ReviewService;

@Service("reviewService")
public class DefaultReviewService implements ReviewService
{
	@Resource(name="reviewDao")
	private ReviewDao reviewDao;
	
	@Override
	@Transactional
	public void saveReview(ReviewModel reviewModel) 
	{
		reviewDao.saveReview(reviewModel);
	}
	
	@Override
	@Transactional
	public List<ReviewModel> getCustomerReviews(Long customerId)
	{
		List<ReviewModel> reviews=reviewDao.getCustomerReviews(customerId);
		
		List<ReviewData> reviewsData= new ArrayList<ReviewData>();
		
		for(ReviewModel reviewModel: reviews)
		{
			ReviewData reviewData= new ReviewData();
			reviewData.setId(reviewModel.getId());
			reviewData.setComment(reviewModel.getComment());
			reviewsData.add(reviewData);
		}
		return reviews;
	}
}
