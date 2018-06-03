package com.training.facade;

import com.training.core.data.MediaData;

public interface MediaFacade 
{
	void createMedia(MediaData media);
	MediaData getMedia(Long mediaId);
}
