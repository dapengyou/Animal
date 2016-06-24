package com.city.animal.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.city.animal.business.IUser;
import com.city.animal.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("regsiterMainAction")
@Scope("prototype")
public class RegsiterMainAction extends ActionSupport{
	IUser iu = null;
	UserValue uv = null;
	
	private File photo=null;
	private String photoFileName=null;
	private String photoContentType=null;
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
	
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}
	
	
	public String regsiter() throws Exception
	{
		if(photoFileName==null||photoFileName.equals("")){
			iu.add(uv);
		}
		else{
			iu.add(uv,photo,photoFileName,photoContentType);
		}
		 
		return "regsiter";
	}
	
}
