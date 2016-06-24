package com.city.animal.business.Impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;

import org.hibernate.LobHelper;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.animal.business.IUser;
import com.city.animal.value.UserValue;
@Service("userBusinessImpl")
@Transactional
public class UserBusinessImpl implements IUser{

	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void add(UserValue uv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(uv);
	}

	@Override
	public void add(UserValue uv, File photo, String photoFileName, String photoContentType) throws Exception {
		// TODO Auto-generated method stub
		uv.setFilename(photoFileName);
		uv.setFiletype(photoContentType);
		LobHelper lh=sf.getCurrentSession().getLobHelper();
		InputStream in=new FileInputStream(photo);
		Blob bphoto=lh.createBlob(in,in.available());
		uv.setFile(bphoto);
		sf.getCurrentSession().save(uv);
	}

}
