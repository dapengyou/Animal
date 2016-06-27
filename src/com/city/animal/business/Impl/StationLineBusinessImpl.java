package com.city.animal.business.Impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.city.animal.business.IStationLine;
import com.city.animal.value.StationLineValue;


@Service("stationLineBusinessImpl")
@Transactional
public class StationLineBusinessImpl implements IStationLine{
	private SessionFactory sf=null;
	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public void add(StationLineValue sv) throws Exception {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(sv);
	}

}
