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
@Table(name="ticketdetails")
public class TicketDetail {
	@Id
	@Column(name="Ticket_No")
	private int ticketNo;
	@Column(name="seat_no")
	private int seatNo;
	@Column(name="passengername")
	private String passengerName;
	@Column(name="Date_Of_Birth")
	private Date dob;
	@Column(name="Gender")
	private String gender;
	@Column(name="Nationality")
	private String nationality;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Ticket_No",nullable=false,insertable=false,updatable=false)
	private Ticket ticket;
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	

}
