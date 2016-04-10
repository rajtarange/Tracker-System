package com.tracker.daoimpl;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tracker.dao.BaseDAO;
import com.tracker.entity.User;
import com.tracker.serviceimpl.BaseServiceImpl;

@Repository
public class BaseDAOImpl implements BaseDAO<User>
{
	private static final Logger logger = Logger.getLogger(BaseServiceImpl.class);
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(User user) 
	{
		try
		{
			logger.info("In BaseDAOImpl");
			sessionFactory.getCurrentSession().save(user);
			return true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(User object)
	{
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(User object) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
