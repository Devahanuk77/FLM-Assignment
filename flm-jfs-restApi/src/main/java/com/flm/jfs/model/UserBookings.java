package com.flm.jfs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserBookings {
	
	@Id
	private String emailId;
	private String source;
	private String destination;
	private String date;
	private int noOfPassengers;
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public UserBookings(String emailId, String source, String destination, String date, int noOfPassengers) {
		this.emailId = emailId;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.noOfPassengers = noOfPassengers;
	}
	
	public UserBookings() {
	}
	
	@Override
	public String toString() {
		return "UserBookings [emailId=" + emailId + ", source=" + source + ", destination=" + destination + ", date="
				+ date + ", noOfPassengers=" + noOfPassengers + "]";
	}
	
	
	
	
	
	

}
