package com.training.core.service;

import com.training.core.model.CourseModel;

public interface CourseService 
{
	void createCourse(CourseModel course);
	CourseModel getCourse(Long courseId);
}
