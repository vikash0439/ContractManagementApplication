package com.contract.system.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table
public class Contract{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long contractid;
	private String contractdate;
	private String baseprice;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity = Booking.class, mappedBy = "contract", cascade=CascadeType.ALL)
	private List<Booking> bookings;	
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity = Performance.class, mappedBy = "contract", cascade=CascadeType.ALL)
	private List<Performance> performances;
	
	@ManyToOne
	@JoinColumn(name ="customerid")
	private Customer customer;
	
	public long getContractid(){
		return contractid;
	}
	public void setContractid(long contractid) {
		this.contractid = contractid;
	}
	public String getContractdate() {
		return contractdate;
	}
	public void setContractdate(String contractdate) {
		this.contractdate = contractdate;
	}
	
	public String getBaseprice() {
		return baseprice;
	}
	public void setBaseprice(String baseprice) {
		this.baseprice = baseprice;
	}
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Performance> getPerformances() {
		return performances;
	}
	public void setPerformances(List<Performance> performances) {
		this.performances = performances;
	}
	
	
}
