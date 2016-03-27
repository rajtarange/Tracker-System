package com.tracker.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController 
{
	private static final Logger logger = Logger.getLogger(DemoController.class);
	
	@RequestMapping(value="/demo")
	public String getScreen()
	{
		System.out.println("in demoo");
		logger.info("In Demo Controller");
		System.out.println("hiiii");
		return "login";
	}
}
