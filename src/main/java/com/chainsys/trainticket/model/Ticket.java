package com.chainsys.trainticket.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Ticket")
public class Ticket {
	
	
	@Id
	@Column(name="ticket_no")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ticketNo")
    @SequenceGenerator(name = "ticketNo", sequenceName = "ticketNo",  allocationSize = 2)
	private int ticketNo;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="train_no")
	private int trainNo;
	
	@Column(name="seat_class")
	@NotBlank(message = "Please Select Class")
	private String seatClass;
	
	@Column(name="travelling_date")
	private Date travellingDate;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="pnr")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PNR")
    @SequenceGenerator(name = "PNR", sequenceName = "PNR",  allocationSize = 2)
	private float pnr;
	
	@Column(name="status")
	@NotEmpty(message = "*Please enter status")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ")
	private String status;
	
	@Column(name="boarding_station")
	@NotEmpty(message = "*Please enter boarding station")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ") 
	private String boardingStation;
	
	@Column(name="destination_station")
	@NotEmpty(message = "*Please enter destination station")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ")
	private String destinationStation;
	
	@Column(name="boarding_time")
	private String boardingTime;
	
	@Column(name="arrival_time")
	private String arrivalTime;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="train_no",nullable=false,insertable=false,updatable=false)
	private TrainDetail trainDetail;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id",nullable=false,insertable=false,updatable=false)
	private User user;
	@OneToOne(mappedBy ="ticket", fetch = FetchType.LAZY)
    private PaymentDetail paymentDetail;
	@OneToMany(mappedBy="ticket",fetch=FetchType.LAZY)
	private List<TicketDetail> ticketDetail;
	
	public List<TicketDetail> getTicketDetail() {
		return ticketDetail;
	}
	public void setTicketDetail(List<TicketDetail> ticketDetail) {
		this.ticketDetail = ticketDetail;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public TrainDetail getTrainDetail() {
		return trainDetail;
	}
	public void setTrainDetail(TrainDetail trainDetail) {
		this.trainDetail = trainDetail;
	}
	public PaymentDetail getPaymentDetail() {
		return paymentDetail;
	}
	public void setPaymentDetail(PaymentDetail paymentDetail) {
		this.paymentDetail = paymentDetail;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	
	
	
}
