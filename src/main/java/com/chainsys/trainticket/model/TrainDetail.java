package com.chainsys.trainticket.model;

import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TrainDetails")
public class TrainDetail {
	@Id
	@Column(name="train_no")
	private int trainNo;
	@Column(name="train_name")
	private String trainName;
	@Column(name="start_place")
	private String startPlace;
	@Column(name="destination")
	private String destination;
	@Column(name="arrival_time")
	private TimeZone arrivalTime;
	@Column(name=" departure_time")
	private TimeZone departureTime;
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getStartPlace() {
		return startPlace;
	}
	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public TimeZone getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(TimeZone arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public TimeZone getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(TimeZone departureTime) {
		this.departureTime = departureTime;
	}
	

	
}
