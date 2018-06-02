package com.training.core.dao;

import com.training.core.model.CourseModel;

public interface CourseDao 
{
	void createCourse(CourseModel cource);
	CourseModel getCourse(Long courseId);
}
