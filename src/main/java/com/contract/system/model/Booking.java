package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Booking{
	
	@Id
	@GeneratedValue
	private long bookingid;
	private String bookingdates;
	private String service;
	private String slot;
	private String venue;
	private String used;
	private String booked;
	private String dateofcancel;
	private String price;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name ="contractid")
	private Contract contract;	
	
	public long getBookingid() {
		return bookingid;
	}
	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdates() {
		return bookingdates;
	}
	public void setBookingdates(String bookingdates) {
		this.bookingdates = bookingdates;
	}
	
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
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
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	public String getBooked() {
		return booked;
	}
	public void setBooked(String booked) {
		this.booked = booked;
	}
	public String getDateofcancel() {
		return dateofcancel;
	}
	public void setDateofcancel(String dateofcancel) {
		this.dateofcancel = dateofcancel;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
