package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class AccruedIssueDropdown implements Serializable {
	
	private Date deadline; 
	private int cieId;
	
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getCieId() {
		return cieId;
	}
	public void setCieId(int cieId) {
		this.cieId = cieId;
	}
    
}
