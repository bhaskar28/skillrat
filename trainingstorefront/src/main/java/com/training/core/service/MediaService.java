package com.training.core.service;

import com.training.core.model.MediaModel;

public interface MediaService 
{
	void createMedia(MediaModel media);
	MediaModel getMedia(Long mediaId);
}
