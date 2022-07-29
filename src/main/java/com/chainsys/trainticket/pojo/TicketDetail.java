package com.chainsys.trainticket.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TicketDetails")
public class TicketDetail {
	@Id
	private float ticket_no;
	private int seat_no;
	private String passengername;
	private int age;
	private String gender;
	private String nationality;
	public float getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(float ticket_No) {
		ticket_no = ticket_No;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		nationality = nationality;
	}
	
	

}
