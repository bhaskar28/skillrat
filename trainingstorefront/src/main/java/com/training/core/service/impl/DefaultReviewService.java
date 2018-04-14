package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.ReviewDao;
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
	
}
