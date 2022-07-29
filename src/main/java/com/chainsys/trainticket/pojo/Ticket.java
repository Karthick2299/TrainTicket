package com.chainsys.trainticket.pojo;

import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {
	@Id
	private String user_id;
	private int train_no;
	private float ticket_no;
	private String seat_class;
	private Date travelling_date;
	private int amount;
	private float pnr;
	private String status;
	private String boarding_station;
	private String destination_station;
	private TimeZone boarding_time;
	private TimeZone arrival_time;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_no) {
		train_no = train_no;
	}
	public float getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(float ticket_No) {
		ticket_no = ticket_No;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_Class) {
		seat_class = seat_Class;
	}
	public Date getTravelling_date() {
		return travelling_date;
	}
	public void setTravelling_date(Date travelling_date) {
		travelling_date = travelling_date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		amount = amount;
	}
	public float getPnr() {
		return pnr;
	}
	public void setPnr(float pNR) {
		pnr = pNR;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBoarding_station() {
		return boarding_station;
	}
	public void setBoarding_station(String boarding_Station) {
		boarding_station = boarding_Station;
	}
	public String getDestination_station() {
		return destination_station;
	}
	public void setDestination_station(String destination_Station) {
		destination_station = destination_Station;
	}
	public TimeZone getBoarding_time() {
		return boarding_time;
	}
	public void setBoarding_time(TimeZone boarding_Time) {
		boarding_time = boarding_Time;
	}
	public TimeZone getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(TimeZone arrival_Time) {
		arrival_time = arrival_Time;
	}
	
	
}
