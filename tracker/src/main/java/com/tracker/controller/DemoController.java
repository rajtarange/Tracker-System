package com.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController 
{
	@RequestMapping(value="/demo")
	public String getScreen()
	{
		System.out.println("in demoo");
		return "login";
	}
}
