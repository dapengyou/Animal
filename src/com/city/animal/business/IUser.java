package com.city.animal.business;

import java.io.File;

import com.city.animal.value.UserValue;

public interface IUser {
	public void add(UserValue uv) throws Exception;
	public void add(UserValue uv,File photo,String photoFileName,String photoContentType) throws Exception;
}
