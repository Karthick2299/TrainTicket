package com.chainsys.trainticket.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	@Id
	private String user_id;
	private String user_password;
	private String user_name;
	private Date date_of_birth;
	private String gender;
    private String mail_id;
	private long phone_number;
	private String address;
	private String nationality;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_Id) {
		user_id = user_Id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_Name) {
		user_name = user_Name;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_Birth) {
		date_of_birth = date_of_Birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_Id) {
		mail_id = mail_Id;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		phone_number = phone_number;
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
		nationality = nationality;
	}
	


}
