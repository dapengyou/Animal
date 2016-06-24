package com.city.animal.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IUser;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("loginMainAction")
@Scope("prototype")
public class LoginMainAction extends ActionSupport{
	IUser iu = null;
	UserValue uv = null;
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	
	
	public String regsiter() throws Exception
	{
		 
		return "login";
	}
	
}
