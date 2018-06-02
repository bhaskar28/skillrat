package com.training.facade;

import com.training.core.data.CourseData;

public interface CourseFacade 
{
	CourseData getCourseById(Long courseId);
}
