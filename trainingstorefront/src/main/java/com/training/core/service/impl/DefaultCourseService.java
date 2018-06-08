package com.training.core.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.training.core.dao.CourseDao;
import com.training.core.model.CourseModel;
import com.training.core.query.data.PaginationData;
import com.training.core.service.CourseService;

@Service("courseService")
public class DefaultCourseService implements CourseService
{
	@Resource(name="courseDao")
	private CourseDao courseDao;
	
	@Override
	@Transactional
	public void createCourse(CourseModel cource) 
	{
		courseDao.createCourse(cource);
	}

	@Override
	@Transactional
	public CourseModel getCourse(Long courseId) 
	{
		return courseDao.getCourse(courseId);
	}

	@Override
	@Transactional
	public List<CourseModel> getCoursesByCategory(PaginationData pagination, Long categoryId) 
	{
		return courseDao.getCoursesByCategory(pagination, categoryId);
	}

	@Override
	@Transactional
	public List<CourseModel> getCoursesByField(PaginationData pagination, Long fieldId) 
	{
		return courseDao.getCoursesByField(pagination, fieldId);
	}

}
