package com.training.core.dao;

import com.training.core.model.MediaModel;

public interface MediaDao 
{
	void createMedia(MediaModel media);
	MediaModel getMedia(Long mediaId);
}
