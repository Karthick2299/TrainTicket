package com.chainsys.trainticket.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



@Entity
@Table(name="traindetails")
public class TrainDetail {
	@Id
	@Column(name="train_no")
	@Min(value = 0,message="*value should be greater than 0")
	private int trainNo;
	
	@Column(name="train_name")
	@Size(max = 20, min = 3, message = "*Name length should be 3 to 20")
	@NotBlank(message = "*Name can't be Empty")
	private String trainName;
	
	@Column(name="start_place")
	@Size(max = 10, min = 1, message = "*Id length should be 1 to 10")
	private String startPlace;
	
	@Column(name="destination")
	@Size(max = 10, min = 1, message = "*Id length should be 1 to 10")
	private String destination;
	
	@Column(name="arrival_time")
	private String arrivalTime;
	
	@Column(name=" departure_time")
	private String  departureTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="start_place",nullable=false,insertable=false,updatable=false)
	private Station station;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="destination",nullable=false,insertable=false,updatable=false)
	private Station stationDestination;
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
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
}
	