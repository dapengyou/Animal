package com.city.animal.business.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.animal.business.IDriver;
import com.city.animal.value.DriverValue;

@Service("driverBusinessImpl")
@Transactional
public class DriverBusinessImpl implements IDriver{
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	

	@Override
	public void add(DriverValue dv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(dv);

	}

}
