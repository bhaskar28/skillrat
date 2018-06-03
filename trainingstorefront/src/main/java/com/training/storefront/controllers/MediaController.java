package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.MediaData;
import com.training.facade.MediaFacade;

@Controller
@RequestMapping("/media")
public class MediaController 
{
	@Resource(name="mediaFacade")
	private MediaFacade mediaFacade;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createMedia(MediaData media)
	{
		mediaFacade.createMedia(media);
	}
	
	@RequestMapping("/{mediaId}")
	@ResponseBody
	public MediaData getMediaById(@PathVariable("mediaId")Long mediaId)
	{
		return mediaFacade.getMedia(mediaId);
	}
}
