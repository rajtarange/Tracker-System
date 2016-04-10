package com.tracker.serviceimpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tracker.dao.BaseDAO;
import com.tracker.entity.User;
import com.tracker.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService<User>
{
	private static final Logger logger = Logger.getLogger(BaseServiceImpl.class);
	@Autowired
	private BaseDAO<User> baseDAO;
	
	@Transactional
	public boolean add(User user)
	{
		logger.info("In BaseServiceImpl");
		user = new User();
		user.setFirstName("rajendra");
		return baseDAO.add(user);
	}

	@Transactional
	public boolean update(User object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean remove(User object) {
		// TODO Auto-generated method stub
		return false;
	}

}
