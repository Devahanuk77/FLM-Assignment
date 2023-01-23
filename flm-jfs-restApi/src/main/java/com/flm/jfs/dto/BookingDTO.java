package com.flm.jfs.dto;

public class BookingDTO {
	
	private String emailId;
	private String source;
	private String destination;
	private String date;
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
	public BookingDTO(String emailId, String source, String destination, String date) {
		this.emailId = emailId;
		this.source = source;
		this.destination = destination;
		this.date = date;
	}
	public BookingDTO() {
	}
	@Override
	public String toString() {
		return "BookingDTO [emailId=" + emailId + ", source=" + source + ", destination=" + destination + ", date="
				+ date + "]";
	}
	
	

}
