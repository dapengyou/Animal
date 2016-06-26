package com.city.animal.action;

import java.io.File;
import java.util.Map;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IUser;
import com.city.animal.business.Impl.UserBusinessImpl;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("loginMainAction")
@Scope("prototype")
public class LoginMainAction extends ActionSupport{
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
	public void validate(){
//		System.out.println(uv.getUsername());
		if(uv.getUsername()==null||uv.getUsername().trim().equals("")){
			this.addFieldError("uv.username", "用户名不能为空");
//			System.out.println("kjflkjdslkfjks");
		}
		if(uv.getPassword()==null||uv.getPassword().trim().equals("")){
			this.addFieldError("uv.password", "密码不能为空");
		}
	}
	public String login() throws Exception{
//		System.out.println(uv.getPower());
		if(!iu.validate(uv.getUsername(), uv.getPassword()))
		{
			this.addFieldError("uv.username", "用户名或密码错误");
			return "tologin";
		}
		else{
			uv = iu.gotUser(uv.getUsername());
			ActionContext ac=ActionContext.getContext();
			Map session=ac.getSession();
			session.put("user", uv);
			return "index"; 
		}
	
	}
}
