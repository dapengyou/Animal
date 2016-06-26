package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IUser;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;
@Controller("indexAction")
@Scope("prototype")
public class indexAction extends ActionSupport{
	
	public String index() throws Exception
	{
		return "index";
	}
	
}
