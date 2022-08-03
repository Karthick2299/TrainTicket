package com.chainsys.trainticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticketdetails")
public class TicketDetail {
	@Id
	@Column(name="ticket_no")
	private float ticketNo;
	@Column(name="seat_no")
	private int seatNo;
	@Column(name="passengername")
	private String passengerName;
	@Column(name="age")
	private int age;
	@Column(name="gender")
	private String gender;
	@Column(name="nationality")
	private String nationality;
	
	
	public float getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(float ticketNo) {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
