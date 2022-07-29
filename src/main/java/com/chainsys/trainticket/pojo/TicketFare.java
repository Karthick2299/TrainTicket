package com.chainsys.trainticket.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" Ticket_fare")
public class TicketFare {
	@Id
	private int train_no;
	private float max_seats;
	private String seat_class;
	private int fare;
	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_No) {
		train_no = train_No;
	}
	public float getMax_seats() {
		return max_seats;
	}
	public void setMax_seats(float max_Seats) {
		max_seats = max_Seats;
	}
	public String getSeat_class() {
		return seat_class;
	}
	public void setSeat_class(String seat_Class) {
		seat_class = seat_Class;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		fare = fare;
	}
	

}
