package com.training.core.dao.impl;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.MediaDao;
import com.training.core.model.MediaModel;

@Repository("mediaDao")
public class DefaultMediaDao implements MediaDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void createMedia(MediaModel media) 
	{
		sessionFactory.getCurrentSession().save(media);
	}

	@Override
	public MediaModel getMedia(Long mediaId) 
	{
		return (MediaModel) sessionFactory.getCurrentSession().get(MediaModel.class, mediaId);
	}

}
