package com.training.facade.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.training.core.data.CategoryData;
import com.training.core.data.CourseData;
import com.training.core.data.CustomerData;
import com.training.core.data.FieldData;
import com.training.core.model.CourseModel;
import com.training.core.query.data.PaginationData;
import com.training.core.service.CourseService;
import com.training.facade.CategoryFacade;
import com.training.facade.CourseFacade;
import com.training.facade.CustomerFacade;
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
	
	@Resource(name="customerFacade")
	private CustomerFacade customerFacade;
	
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
	
	@Override
	public List<CourseData> getCoursesByCategory(PaginationData pagination,Long categoryId)
	{
		List<CourseModel> courses=courseService.getCoursesByCategory(pagination, categoryId);
		List<CourseData> coursesData = convert(courses);
		return coursesData;
	}

	@Override
	public List<CourseData> getCoursesByField(PaginationData pagination, Long fieldId) 
	{
		List<CourseModel> courses=courseService.getCoursesByField(pagination, fieldId);
		List<CourseData> coursesData = convert(courses);
		return coursesData;
	}
	
	private List<CourseData> convert(List<CourseModel> courses) 
	{
		List<CourseData> coursesData= new ArrayList<CourseData>();
		for(CourseModel course: courses)
		{
			FieldData fieldData= fieldsFacade.getFieldById(course.getField().getId());
			CustomerData customerData=customerFacade.getCustomerById(course.getOwner().getId());
			CourseData courseData= new CourseData();
			courseData.setCategoryId(course.getId());
			courseData.setTitle(course.getTitle());
			courseData.setFieldData(fieldData);
			courseData.setCustomerData(customerData);
			coursesData.add(courseData);
		}
		return coursesData;
	}

}
