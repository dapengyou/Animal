package com.city.animal.business.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.animal.business.IBus;
import com.city.animal.value.BusValue;
@Service("busBusinessImpl")
@Transactional
public class BusBusinessImpl implements IBus{
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void add(BusValue bv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(bv);
	}

}
