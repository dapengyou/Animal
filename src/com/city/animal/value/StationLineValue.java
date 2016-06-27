package com.city.animal.value;

import java.util.Set;

public class StationLineValue {
	private String stationName;	//站名，主键
	private String  startStation;	//始发站
	private String endStation;		//终点站
	private String  arriveTime;   //到站时间
	private String  moveTime;		//驶离时间
	
	private Set<BusValue> buses = null;
	
	
	public Set<BusValue> getBuses() {
		return buses;
	}
	public void setBuses(Set<BusValue> buses) {
		this.buses = buses;
	}
	
	public String getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(String moveTime) {
		this.moveTime = moveTime;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getEndStation() {
		return endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	
}
