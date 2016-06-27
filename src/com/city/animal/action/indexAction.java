package com.city.animal.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
@Controller("indexAction")
@Scope("prototype")
public class indexAction extends ActionSupport{
	
	public String index() throws Exception
	{
		return "index";
	}
	
}
