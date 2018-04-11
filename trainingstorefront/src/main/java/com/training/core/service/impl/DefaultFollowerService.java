package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.training.core.dao.FollowerDao;
import com.training.core.model.FollowerModel;
import com.training.core.service.FollowerService;
@Service("followerService")
public class DefaultFollowerService implements FollowerService{
	@Resource(name="followerDao")
	private FollowerDao followerDao;

	@Override
	@Transactional
	public void saveFollower(FollowerModel followerModel) {
		followerDao.createFollower(followerModel);
		
	}
}

	
	