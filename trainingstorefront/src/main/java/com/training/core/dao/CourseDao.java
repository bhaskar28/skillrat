package com.training.core.dao;

import java.util.List;

import com.training.core.model.CourseModel;
import com.training.core.query.data.PaginationData;

public interface CourseDao 
{
	void createCourse(CourseModel cource);
	CourseModel getCourse(Long courseId);
	List<CourseModel> getCoursesByCategory(PaginationData pagination, Long categoryId);
	List<CourseModel> getCoursesByField(PaginationData pagination, Long fieldId);
}
