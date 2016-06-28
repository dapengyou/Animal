package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IBus;
import com.city.animal.business.IDriver;
import com.city.animal.business.IStationLine;
import com.city.animal.business.IUser;
import com.city.animal.value.BusValue;
import com.city.animal.value.DriverValue;
import com.city.animal.value.StationLineValue;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("toDriverAction")
@Scope("prototype")
//添加司机前分发
public class ToDriverAction extends ActionSupport{

	public String todriver() throws Exception
	{
		return "todriver";
	}
	
}
