package com.chainsys.trainticket.model;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="traindetails")
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
	private Timestamp arrivalTime;
	
	@Column(name=" departure_time")
	private Timestamp departureTime;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_place",nullable=false,insertable=false,updatable=false)
	private Station station;
	@OneToMany(mappedBy="trainDetail",fetch=FetchType.LAZY)
	private List<TicketFare> ticketFare;
	@OneToMany(mappedBy="trainDetail",fetch=FetchType.LAZY)
	private List<Ticket> ticket;
	
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	public List<TicketFare> getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(List<TicketFare> ticketFare) {
		this.ticketFare = ticketFare;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
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
	public Timestamp getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Timestamp getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
}
	