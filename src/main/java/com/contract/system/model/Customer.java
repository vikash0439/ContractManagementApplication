package com.contract.system.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "customerid", updatable = false, nullable = false)
	private long customerid;
	private String customername;
	private String landline;
	private String website;
	private String address;
	private String statecode;
	private String category;
	private String gstno;
	private String remark;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity = Contract.class, mappedBy = "customer", cascade=CascadeType.ALL)
	private List<Contract> contract;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity = Rep.class, mappedBy = "customer", fetch = FetchType.LAZY)
	private List<Rep> rep;	

	
	public List<Contract> getContract() {
		return contract;
	}
	public void setContract(List<Contract> contract) {
		this.contract = contract;
	}
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getGstno() {
		return gstno;
	}
	public void setGstno(String gstno) {
		this.gstno = gstno;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}
	public List<Rep> getRep() {
		return rep;
	}
	public void setRep(List<Rep> rep) {
		this.rep = rep;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", landline=" + landline
				+ ", website=" + website + ", address=" + address + ", statecode=" + statecode + ", category="
				+ category + ", gstno=" + gstno + ", remark=" + remark + ", contract=" + contract + "]";
	}
	
	

}
