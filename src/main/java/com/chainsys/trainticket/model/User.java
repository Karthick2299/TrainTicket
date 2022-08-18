package com.chainsys.trainticket.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="Users")
public class User {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "userId")
    @SequenceGenerator(name = "userId", sequenceName = "userId",  allocationSize = 2)
	private int userId;
	
	@Column(name="user_password")
	@Size(max = 20, min = 8, message = "*Password length should be 8 to 20")
	@NotBlank(message = "*Password can't be Empty")
	private String userPassword;
	
	@Column(name="user_name")
	@Size(max = 20, min = 3, message = "*Name length should be 3 to 20")
	@NotBlank(message = "*Name can't be Empty")
	@Pattern(regexp = "^[A-Za-z]\\w{3,20}$", message = "*Enter valid name ")
	private String userName;
	
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="gender")
	@NotBlank(message = "*Please select gender")
	private String gender;
	
	@Column(name="mail_id")
	@Email(message = "*Email is not valid")
	@NotBlank(message = "*Please enter email")
    private String mailId;
	
	@Column(name="phone_number")
	@Digits(integer = 10, fraction = 0)
	private long phoneNumber;
	
	@Column(name="address")
	@NotBlank(message = "Address Must be required")
	private String address;
	
	@Column(name="nationality")
	@NotBlank(message = "Please Enter your Nationality")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "*Value should be in Alphabets ")
	private String nationality;
	
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<Ticket> ticket;
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<PaymentDetail> paymentDetail;
	
	public List<PaymentDetail> getPaymentDetail() {
		return paymentDetail;
	}
	public void setPaymentDetail(List<PaymentDetail> paymentDetail) {
		this.paymentDetail = paymentDetail;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}	
	
}
