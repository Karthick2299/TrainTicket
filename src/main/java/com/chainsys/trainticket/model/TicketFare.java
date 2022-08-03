package com.chainsys.trainticket.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" ticket_fare")
public class TicketFare {
	@Id
	@Column(name="train_no")
	private int trainNo;
	@Column(name="Travel_Date")
	private Date travelDate;
	@Column(name="max_seats")
	private float maxSeats;
	@Column(name="seat_class")
	private String seatClass;
	@Column(name="fare")
	private int fare;
	
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public float getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(float maxSeats) {
		this.maxSeats = maxSeats;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
}