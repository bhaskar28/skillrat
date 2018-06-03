package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.core.dao.CourseDao;
import com.training.core.model.CourseModel;
import com.training.core.query.data.PaginationData;

@Repository("courseDao")
public class DefaultCourseDao implements CourseDao
{
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public void createCourse(CourseModel cource) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cource);
	}

	@Override
	public CourseModel getCourse(Long courseId) 
	{
		return (CourseModel) sessionFactory.getCurrentSession().get(CourseModel.class, courseId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CourseModel> getCoursesByCategory(PaginationData pagination, Long categoryId) 
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.CourseModel.class.getName()+" "
				+ " category.id :=categoryId");
		query.setParameter("categoryId", categoryId);
		query.setMaxResults(pagination.getPageSize());
		query.setFirstResult((pagination.getPage()-1)*pagination.getPageSize());
		return query.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CourseModel> getCoursesByField(PaginationData pagination, Long fieldId)
	{
		Query query=sessionFactory.getCurrentSession().createQuery("From "+com.training.core.model.CourseModel.class.getName()+" "
				+ " field.id :=categoryId");
		query.setParameter("fieldId", fieldId);
		query.setMaxResults(pagination.getPageSize());
		query.setFirstResult((pagination.getPage()-1)*pagination.getPageSize());
		return query.list();
	}
}
