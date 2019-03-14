package com.contract.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Slot {
	
	@Id
	@GeneratedValue
	private long slotid;
	private String slotname;
	private String starttime;
	private String endtime;
	
	
	public long getSlotid() {
		return slotid;
	}
	public void setSlotid(long slotid) {
		this.slotid = slotid;
	}
	public String getSlotname() {
		return slotname;
	}
	public void setSlotname(String slotname) {
		this.slotname = slotname;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getEndtime() {
		return endtime;
	}
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	
	

}
