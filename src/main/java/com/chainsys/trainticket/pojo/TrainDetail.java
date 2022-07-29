package com.chainsys.trainticket.pojo;

import java.util.TimeZone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrainDetails")
public class TrainDetail {
	@Id
	private int train_no;
	private String train_name;
	private String  start_place;
	private String  destination;
	private TimeZone arrival_time;
	private TimeZone departure_time;

	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_No) {
		train_no = train_No;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_Name) {
		train_name = train_Name;
	}
	public String getStart_place() {
		return start_place;
	}
	public void setStart_place(String start_place) {
		start_place = start_place;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public TimeZone getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(TimeZone arrival_Time) {
		arrival_time = arrival_Time;
	}
	public TimeZone getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(TimeZone departure_time) {
		departure_time = departure_time;
	}
	
}
