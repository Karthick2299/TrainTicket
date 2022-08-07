package com.chainsys.trainticket.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name=" Ticket_fare")
public class TicketFare {
	@Id
	@Column(name="train_no")
	private int trainNo;
	@Column(name="max_seats")
	private float maxSeats;
	@Column(name="seat_class")
	private String seatClass;
	@Column(name="fare")
	private int fare;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="train_no",nullable=false,insertable=false,updatable=false)
	private TrainDetail trainDetail;
	
	public TrainDetail getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
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