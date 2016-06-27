package com.city.animal.value;

import java.util.Set;

public class DriverValue {
	private int driverId;	//司机ID
	private String driverName;	//车主姓名
	private String identity;		//身份证
	private Set<BusValue> buses = null;
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public Set<BusValue> getBuses() {
		return buses;
	}
	public void setBuses(Set<BusValue> buses) {
		this.buses = buses;
	}
	
	
}
