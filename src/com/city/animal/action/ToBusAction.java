package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IBus;
import com.city.animal.business.IStationLine;
import com.city.animal.business.IUser;
import com.city.animal.value.BusValue;
import com.city.animal.value.StationLineValue;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("toBusAction")
@Scope("prototype")
public class ToBusAction extends ActionSupport{
	IBus ib = null;
	BusValue nv = null;
	
	public IBus getIb() {
		return ib;
	}
	@Autowired
	public void setIb(IBus ib) {
		this.ib = ib;
	}

	public BusValue getNv() {
		return nv;
	}

	public void setNv(BusValue nv) {
		this.nv = nv;
	}

	public String tobus() throws Exception
	{
		return "tobus";
	}
	
}
