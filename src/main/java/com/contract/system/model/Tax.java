package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Tax {

	@Id
	@GeneratedValue
	private int taxid;
	private String saccode;
	private String description;
	private int igst;
	private int sgst;
	private int cgst;
	
	
	public int getTaxid() {
		return taxid;
	}
	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}
	public String getSaccode() {
		return saccode;
	}
	public void setSaccode(String saccode) {
		this.saccode = saccode;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIgst() {
		return igst;
	}
	public void setIgst(int igst) {
		this.igst = igst;
	}
	public int getSgst() {
		return sgst;
	}
	public void setSgst(int sgst) {
		this.sgst = sgst;
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	
	
	
	
}
