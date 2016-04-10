package com.tracker.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tracker.entity.User;
import com.tracker.service.BaseService;

@Controller
public class DemoController 
{
	private static final Logger logger = Logger.getLogger(DemoController.class);
	
	@Autowired
	private BaseService<User> baseService;
	
	@RequestMapping(value="/demo")
	public String getScreen()
	{
		User user = null;
		baseService.add(user);
		logger.info("In Demo Controller");
		return "login";
	}
}
