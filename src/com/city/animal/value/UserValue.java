package com.city.animal.value;

import java.sql.Blob;

public class UserValue {
	private String username=null;
	private String power = null;
	private String password = null;
	private int age=0;
	private String sex=null;
	private String filename=null;
	private Blob file=null;
	private String filetype=null;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	public String getFiletype() {
		return filetype;
	}
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}
	
}
