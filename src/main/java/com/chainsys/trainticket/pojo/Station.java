package com.chainsys.trainticket.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stations")
public class Station {
	@Id
	private String station_id;
	private String station_name;
	private String station_address;
	public String getStation_id() {
		return station_id;
	}
	public void setStation_id(String station_Id) {
		station_id = station_Id;
	}
	public String getStation_name() {
		return station_name;
	}
	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}
	public String getStation_address() {
		return station_address;
	}
	public void setStation_address(String station_address) {
		this.station_address = station_address;
	}
	
}
