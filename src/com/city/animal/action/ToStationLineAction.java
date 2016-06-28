package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IStationLine;
import com.city.animal.business.IUser;
import com.city.animal.value.StationLineValue;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("toStationLineAction")
@Scope("prototype")
public class ToStationLineAction extends ActionSupport{
	IStationLine isl = null;
	StationLineValue sv = null;
	
	
	public IStationLine getIsl() {
		return isl;
	}
	@Autowired
	public void setIsl(IStationLine isl) {
		this.isl = isl;
	}
	public StationLineValue getSv() {
		return sv;
	}
	public void setSv(StationLineValue sv) {
		this.sv = sv;
	}


	
	public String tostationLine() throws Exception
	{
		return "tostationLine";
	}
	
}
