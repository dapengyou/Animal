package com.city.animal.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IBus;
import com.city.animal.business.IUser;
import com.city.animal.value.BusValue;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;
@Controller("busAction")
@Scope("prototype")
public class BusAction extends ActionSupport{
	IBus ib = null;
	BusValue bv = null;
	
	public IBus getIb() {
		return ib;
	}
	@Autowired
	public void setIb(IBus ib) {
		this.ib = ib;
	}

	
	
	public BusValue getBv() {
		return bv;
	}
	public void setBv(BusValue bv) {
		this.bv = bv;
	}
	public String bus() throws Exception
	{
		ib.add(bv);
		return "bus";
	}
	
}
