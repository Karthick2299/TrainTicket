package com.chainsys.trainticket.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentDetails")
public class PaymentDetail {
	@Id
	private float ticket_no;
	private String  user_id;
	private String  receipt_no;
	private int amount;
	private String mode_of_payment;
	private String payment_details;
	private Date payment_date; 
	public float getTicket_no() {
		return ticket_no;
	}
	public void setTicket_no(float ticket_no) {
		ticket_no = ticket_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_Id) {
		user_id = user_Id;
	}
	public String getReceipt_no() {
		return receipt_no;
	}
	public void setReceipt_no(String receipt_No) {
		receipt_no = receipt_No;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		amount = amount;
	}
	public String getMode_of_payment() {
		return mode_of_payment;
	}
	public void setMode_of_payment(String mode_Of_Payment) {
		mode_of_payment = mode_Of_Payment;
	}
	public String getPayment_details() {
		return payment_details;
	}
	public void setPayment_details(String payment_Details) {
		payment_details = payment_Details;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_Date) {
		payment_date = payment_Date;
	}
	

}
