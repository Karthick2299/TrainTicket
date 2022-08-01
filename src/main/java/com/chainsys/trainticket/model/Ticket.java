package com.chainsys.trainticket.model;

import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="train_no")
	private int trainNo;
	@Column(name="ticket_no")
	private float ticketNo;
	@Column(name="seat_class")
	private String seatClass;
	@Column(name="travelling_date")
	private Date travellingDate;
	@Column(name="amount")
	private int amount;
	@Column(name="pnr")
	private float pnr;
	@Column(name="status")
	private String status;
	@Column(name="boarding_station")
	private String boardingStation;
	@Column(name="destination_station")
	private String destinationStation;
	@Column(name="boarding_time")
	private TimeZone boardingTime;
	@Column(name="arrival_time")
	private TimeZone arrivalTime;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public float getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(float ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getSeatClass() {
		return seatClass;
	}
	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}
	public Date getTravellingDate() {
		return travellingDate;
	}
	public void setTravellingDate(Date travellingDate) {
		this.travellingDate = travellingDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getPnr() {
		return pnr;
	}
	public void setPnr(float pnr) {
		this.pnr = pnr;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBoardingStation() {
		return boardingStation;
	}
	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public TimeZone getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(TimeZone boardingTime) {
		this.boardingTime = boardingTime;
	}
	public TimeZone getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(TimeZone arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
}
