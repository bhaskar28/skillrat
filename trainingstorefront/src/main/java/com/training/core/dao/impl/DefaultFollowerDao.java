package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.training.core.dao.FollowerDao;
import com.training.core.model.FollowerModel;
@Repository("followerDao")
public class DefaultFollowerDao implements FollowerDao{

	// sessionFactory is a database connection factory name.which is configured in xml file.
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public void createFollower(FollowerModel follower) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate( follower);
	}
}


