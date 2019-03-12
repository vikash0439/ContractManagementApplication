package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Performance {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long performanceid;
	private String showname;
	private String showtime;
	private String showdetails;
	private String showdate;
	
	@ManyToOne
	@JoinColumn(name ="contractid")
	private Contract contract;

	public long getPerformanceid() {
		return performanceid;
	}

	public void setPerformanceid(long performanceid) {
		this.performanceid = performanceid;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getShowdetails() {
		return showdetails;
	}

	public void setShowdetails(String showdetails) {
		this.showdetails = showdetails;
	}

	public String getShowdate() {
		return showdate;
	}

	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
}
