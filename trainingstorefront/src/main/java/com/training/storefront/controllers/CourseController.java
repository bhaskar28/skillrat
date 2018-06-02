package com.training.storefront.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.CourseData;
import com.training.core.model.CategoryModel;
import com.training.core.model.CourseModel;
import com.training.core.model.CustomerModel;
import com.training.core.model.FieldModel;
import com.training.core.query.data.PaginationData;
import com.training.core.service.CategoryService;
import com.training.core.service.CourseService;
import com.training.core.service.CustomerService;
import com.training.core.service.FieldService;
import com.training.core.util.TrainingDateUtil;

@Controller
@RequestMapping("/course")
public class CourseController 
{
	@Resource(name="courseService")
	private CourseService courseService;

	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="categoryService")
	private CategoryService categoryService;
	
	@Resource(name="fieldService")
	private FieldService fieldService;
	
	@RequestMapping(value="/course", method= RequestMethod.POST)
	public void createCourse(CourseData courseData)
	{
		FieldModel fieldModel=fieldService.getFieldById(courseData.getFieldId());
		CategoryModel category=categoryService.getCategoryById(courseData.getCategoryId());
		CustomerModel customer=customerService.getCustomerById(courseData.getCustomerId());
		CustomerModel trainer=customerService.getCustomerByUserName(courseData.getTrainer());
		CourseModel course= new CourseModel();
		course.setContent(courseData.getContent());
		course.setCreationTime(TrainingDateUtil.getCreationTime());
		course.setTitle(course.getTitle());
		course.setOwner(customer);
		course.setTrainer(trainer);
		course.setCategory(category);
		course.setField(fieldModel);
		courseService.createCourse(course);
	}
	
	public List<CourseData> getCourseByCategory(PaginationData paginationData, Long categoryId)
	{
		List<CourseModel> courses=courseService.getCoursesByCategory(paginationData, categoryId);
		List<CourseData> coursesData= new ArrayList<CourseData>();
		for(CourseModel course: courses)
		{
			CourseData courseData= new CourseData();
			courseData.setId(course.getId());
			courseData.setTitle(course.getTitle());
			courseData.setContent(course.getContent());
			courseData.setCreatedDate(course.getCreationTime());
			coursesData.add(courseData);
		}
		return coursesData;
	}
}
