package com.city.animal.value;

import java.util.Set;

public class BusValue {
	private String IdCar;	//公交车序号
	private String type;		//车类型
	private String carNumber;	//车牌
	private int number;			//装载人数
	private String earlyBus;		//早班车时间
	private String lastBus;		//末班车时间
	private Set<StationLineValue> stations = null;
	private DriverValue driver = null;
	
	
	public String getEarlyBus() {
		return earlyBus;
	}
	public void setEarlyBus(String earlyBus) {
		this.earlyBus = earlyBus;
	}
	public String getLastBus() {
		return lastBus;
	}
	public void setLastBus(String lastBus) {
		this.lastBus = lastBus;
	}
	public DriverValue getDriver() {
		return driver;
	}
	public void setDriver(DriverValue driver) {
		this.driver = driver;
	}
	public Set<StationLineValue> getStations() {
		return stations;
	}
	public void setStations(Set<StationLineValue> stations) {
		this.stations = stations;
	}
	public String getIdCar() {
		return IdCar;
	}
	public void setIdCar(String idCar) {
		IdCar = idCar;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
