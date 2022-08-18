package com.chainsys.trainticket.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.chainsys.trainticket.compositekey.TicketDetailCompositeKey;

@Entity
@Table(name="ticketdetails")
@IdClass(TicketDetailCompositeKey.class)
public class TicketDetail {
	@Id
	@Column(name="Ticket_No")
	private int ticketNo;
	
	@Column(name="seat_no")
	private int seatNo;
	
	@Column(name="passengername")
	@Size(max = 20, min = 3, message = "*Name length should be 3 to 20")
	@NotBlank(message = "*Name can't be Empty")
	@Pattern(regexp = "^[A-Za-z]\\w{3,20}$", message = "*Enter valid name ")
	private String passengerName;
	
	@Column(name="Date_Of_Birth")
	private Date dob;
	
	@Column(name="Gender")
	@NotBlank(message = "*Please select gender")
	private String gender;
	
	@Column(name="Nationality")
	@NotBlank(message = "Please Enter your Nationality")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ")
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
