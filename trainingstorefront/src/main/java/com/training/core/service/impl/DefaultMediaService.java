package com.training.core.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.MediaDao;
import com.training.core.model.MediaModel;
import com.training.core.service.MediaService;

@Service("mediaService")
public class DefaultMediaService implements MediaService
{
	@Resource(name="mediaDao")
	private MediaDao mediaDao;
	
	@Override
	@Transactional
	public void createMedia(MediaModel media) 
	{
		mediaDao.createMedia(media);
	}

	@Override
	@Transactional
	public MediaModel getMedia(Long mediaId) 
	{
		return mediaDao.getMedia(mediaId);
	}

}
