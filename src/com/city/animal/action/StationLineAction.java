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
@Controller("stationLineAction")
@Scope("prototype")
public class StationLineAction extends ActionSupport{
	IStationLine stationLine = null;
	StationLineValue sv = null;
	
	public IStationLine getStationLine() {
		return stationLine;
	}
	@Autowired
	public void setStationLine(IStationLine stationLine) {
		this.stationLine = stationLine;
	}
	public StationLineValue getSv() {
		return sv;
	}
	public void setSv(StationLineValue sv) {
		this.sv = sv;
	}


	public String stationLine() throws Exception
	{
		stationLine.add(sv);
		return "stationLine";
	}
	
}
