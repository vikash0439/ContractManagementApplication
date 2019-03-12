package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Venue {
	
	@Id
	private int venueid;
	private String date;	
	private String venuename;
	private String booked;
	
	public int getVenueid() {
		return venueid;
	}
	
	public void setVenueid(int venueid) {
		this.venueid = venueid;
	}

	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}

	public String getVenuename() {
		return venuename;
	}

	public void setVenuename(String venuename) {
		this.venuename = venuename;
	}


	public String getBooked() {
		return booked;
	}

	public void setBooked(String booked) {
		this.booked = booked;
	}

	public Venue() {
		// TODO Auto-generated constructor stub
	}

}
