package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Venue {
	
	@Id
	@GeneratedValue
	private int venueid;	
	private String venuename;
	private String details;
	
	public int getVenueid() {
		return venueid;
	}
	public void setVenueid(int venueid) {
		this.venueid = venueid;
	}
	public String getVenuename() {
		return venuename;
	}
	public void setVenuename(String venuename) {
		this.venuename = venuename;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
