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
@Controller("driverAction")
@Scope("prototype")
public class DriverAction extends ActionSupport{
	
	public String driver() throws Exception
	{
		return "driver";
	}
	
}
