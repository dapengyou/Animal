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

@Controller("regsiterAction")
@Scope("prototype")
public class RegsiterAction extends ActionSupport{
	IUser iu = null;
	UserValue uv = null;
	
//	private List<String> powerList = null;
//	private List<String> sexList = null;
//	
	
	public IUser getIu() {
		return iu;
	}
	@Autowired
	public void setIu(IUser iu) {
		this.iu = iu;
	}
	public UserValue getUv() {
		return uv;
	}
	public void setUv(UserValue uv) {
		this.uv = uv;
	}
	
	
	public String toregsiter() throws Exception
	{
//		powerList = new ArrayList<String>();
//		sexList = new ArrayList<String>();
//		powerList.add(this.getText("user"));
//		powerList.add(this.getText("manage"));
//		sexList.add(this.getText("man"));
//		sexList.add(this.getText("woman"));
		return "toregsiter";
	}
	
}
