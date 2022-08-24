package com.chainsys.trainticket.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.chainsys.trainticket.compositekey.TicketFareCompositeKey;

@Entity
@Table(name=" Ticket_fare")
@IdClass(TicketFareCompositeKey.class)
public class TicketFare {
	@Id
	@Column(name="train_no")
	private int trainNo;
	
	@Column(name="max_seats")
	@NotBlank(message = "*Please put the Seat Capacity")
	private float maxSeats;
	
	@Id
	@Column(name="seat_class")
	@NotBlank(message = "Please Enter Seat Class")
	private String seatClass;
	
	@Column(name="fare")
	private int fare;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="train_no",nullable=false,insertable=false,updatable=false)
	private TrainDetail trainDetail;

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

	public TrainDetail getTrainDetail() {
		return trainDetail;
	}

	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}
	
	
}