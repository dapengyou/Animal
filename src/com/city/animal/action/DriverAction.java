package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IDriver;
import com.city.animal.business.IUser;
import com.city.animal.value.DriverValue;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;
@Controller("driverAction")
@Scope("prototype")
public class DriverAction extends ActionSupport{
	IDriver id = null;
	DriverValue dv = null;
	
	public IDriver getId() {
		return id;
	}
	@Autowired
	public void setId(IDriver id) {
		this.id = id;
	}

	public DriverValue getDv() {
		return dv;
	}

	public void setDv(DriverValue dv) {
		this.dv = dv;
	}
	public String driver() throws Exception
	{
		id.add(dv);
		return "driver";
	}
	
}
