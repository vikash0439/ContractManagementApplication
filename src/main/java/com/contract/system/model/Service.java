package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Service {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long serviceid;
	private String servicename;
	private String price;
	private String unitofmeasurement;
	private String slot;
	private String venue;
	private String saccode;
	
	public long getServiceid() {
		return serviceid;
	}
	public void setServiceid(long serviceid) {
		this.serviceid = serviceid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUnitofmeasurement() {
		return unitofmeasurement;
	}
	public void setUnitofmeasurement(String unitofmeasurement) {
		this.unitofmeasurement = unitofmeasurement;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getSaccode() {
		return saccode;
	}
	public void setSaccode(String saccode) {
		this.saccode = saccode;
	}
	
	
}
