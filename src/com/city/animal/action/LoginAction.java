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

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport{
	IUser iu = null;
	UserValue uv = null;
	
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
	
	
	public String tologin() throws Exception
	{
		return "tologin";
	}
	
}
