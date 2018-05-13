package com.training.core.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.training.core.dao.FieldDao;
import com.training.core.model.FieldModel;

@Repository("fieldDao")
public class DefaultFieldDao implements FieldDao
{
	// sessionFactory is a database connection factory name.which is configured in xml file.
		@Resource(name="sessionFactory")
		private SessionFactory sessionFactory;

		@Override
		public void createField(FieldModel field) 
		{
			sessionFactory.getCurrentSession().saveOrUpdate( field);
		}

		@Override
		public FieldModel getFieldById(Long id) 
		{
			return (FieldModel) sessionFactory.getCurrentSession().get(FieldModel.class, id);
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<FieldModel> getFieldsByCategory(Long categoryId) 
		{
			Query query=sessionFactory.getCurrentSession().createQuery("FROM "+com.training.core.model.FieldModel.class.getName()+" "
					+ " WHERE category.id =: categoryId");
			query.setParameter("categoryId", categoryId);
			
			if(query == null || CollectionUtils.isEmpty(query.list()))
			{
				return null;
			}
			return query.list();
		}
}
