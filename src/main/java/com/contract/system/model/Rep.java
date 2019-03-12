package com.contract.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rep" , schema = "srcpa")
public class Rep{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "repid", updatable = false, nullable = false)
	private long repid;
	private String repname;
	private String repmobile;
	private String repemail;
	
	@ManyToOne
	@JoinColumn(name = "customerid")
	private Customer customer;

	public long getRepid() {
		return repid;
	}

	public void setRepid(long repid) {
		this.repid = repid;
	}

	public String getRepname() {
		return repname;
	}

	public void setRepname(String repname) {
		this.repname = repname;
	}

	

	public String getRepmobile() {
		return repmobile;
	}

	public void setRepmobile(String repmobile) {
		this.repmobile = repmobile;
	}

	public String getRepemail() {
		return repemail;
	}

	public void setRepemail(String repemail) {
		this.repemail = repemail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Rep [repid=" + repid + ", repname=" + repname + ", repmobile=" + repmobile + ", repemail=" + repemail
				+ ", customer=" + customer + "]";
	}
	
	
}
