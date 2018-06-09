package com.training.facade;

import java.util.List;

import com.training.core.data.CourseData;
import com.training.core.query.data.PaginationData;

public interface CourseFacade 
{
	CourseData getCourseById(Long courseId);
	List<CourseData> getCoursesByCategory(PaginationData pagination,Long categoryId);
	List<CourseData> getCoursesByField(PaginationData pagination, Long fieldId);
}
