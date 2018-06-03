package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.MediaData;
import com.training.core.model.MediaModel;
import com.training.core.service.MediaService;
import com.training.core.util.TrainingDateUtil;
import com.training.facade.MediaFacade;

@Component("mediaFacade")
public class DefaultMediaFacade implements MediaFacade
{
	@Resource(name="mediaService")
	private MediaService mediaService;
	
	@Override
	public void createMedia(MediaData media) 
	{
		MediaModel mediaModel= new MediaModel();
		mediaModel.setName(media.getName());
		mediaModel.setUrl(media.getUrl());
		mediaModel.setCreationTime(TrainingDateUtil.getCreationTime());
		mediaService.createMedia(mediaModel);
	}

	@Override
	public MediaData getMedia(Long mediaId) 
	{
		MediaModel mediaModel= mediaService.getMedia(mediaId);
		MediaData mediaData= new MediaData();
		mediaData.setCreationTime(mediaData.getCreationTime());
		mediaData.setId(mediaModel.getId());
		mediaData.setName(mediaModel.getName());
		mediaData.setUrl(mediaData.getUrl());
		return mediaData;
	}
	
}
