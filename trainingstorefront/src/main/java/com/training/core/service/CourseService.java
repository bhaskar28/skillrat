package com.training.core.service;

import java.util.List;

import com.training.core.model.CourseModel;
import com.training.core.query.data.PaginationData;

public interface CourseService 
{
	void createCourse(CourseModel course);
	CourseModel getCourse(Long courseId);
	List<CourseModel> getCoursesByCategory(PaginationData pagination, Long categoryId);
	List<CourseModel> getCoursesByField(PaginationData pagination, Long fieldId);
}
