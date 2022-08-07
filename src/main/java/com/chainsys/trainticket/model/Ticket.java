package com.chainsys.trainticket.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
	
	@Column(name="user_id")
	private String userId;
	@Column(name="train_no")
	private int trainNo;
	@Id
	@Column(name="ticket_no")
	private int ticketNo;
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
	private Timestamp boardingTime;
	@Column(name="arrival_time")
	private Timestamp arrivalTime;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="train_no",nullable=false,insertable=false,updatable=false)
	private TrainDetail trainDetail;
	
	public TrainDetail getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}
	@OneToOne(mappedBy ="ticket", fetch = FetchType.LAZY)
    private PaymentDetail paymentDetail;
	
	public PaymentDetail getPaymentDetail() {
		return paymentDetail;
	}
	public void setPaymentDetail(PaymentDetail paymentDetail) {
		this.paymentDetail = paymentDetail;
	}
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
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
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
	public Timestamp getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(Timestamp boardingTime) {
		this.boardingTime = boardingTime;
	}
	public Timestamp getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	
}
