package com.city.animal.business;

import java.io.File;

import com.city.animal.value.UserValue;

public interface IUser {
	//粗粒度增加用户
	public void add(UserValue uv) throws Exception;
	//细粒度增加用户
	public void add(UserValue uv,File photo,String photoFileName,String photoContentType) throws Exception;
	//验证用户是否合法
	public boolean validate(String Username,String password) throws Exception;
	//取得指定用户的信息
	public UserValue gotUser(String Username) throws Exception;
}
