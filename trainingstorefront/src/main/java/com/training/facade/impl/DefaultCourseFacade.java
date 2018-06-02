package com.training.facade.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.CategoryData;
import com.training.core.data.CourseData;
import com.training.core.data.FieldData;
import com.training.core.model.CourseModel;
import com.training.core.service.CourseService;
import com.training.facade.CategoryFacade;
import com.training.facade.CourseFacade;
import com.training.facade.FieldsFacade;

@Component("courseFacade")
public class DefaultCourseFacade implements CourseFacade 
{
	@Resource(name="courseService")
	private CourseService courseService;
	
	@Resource(name="fieldsFacade")
	private FieldsFacade fieldsFacade;
	
	@Resource(name="categoryFacade")
	private CategoryFacade categoryFacade;
	
	@Override
	public CourseData getCourseById(Long courseId) 
	{
		CourseModel courseModel=courseService.getCourse(courseId);
		CourseData courseData= new CourseData();
		courseData.setContent(courseModel.getContent());
		courseData.setId(courseModel.getId());
		
		FieldData fieldData=fieldsFacade.getFieldById(courseModel.getField().getId());
		courseData.setFieldData(fieldData);
		
		CategoryData categoryData=categoryFacade.getCategoryData(courseModel.getCategory().getId());
		courseData.setCategoryData(categoryData);
		return courseData;
	}
	
}
