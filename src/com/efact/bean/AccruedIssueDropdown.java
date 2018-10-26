package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class AccruedIssueDropdown implements Serializable {
	
	private String deadline; 
	private String cieId;
	
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getCieId() {
		return cieId;
	}
	public void setCieId(String cieId) {
		this.cieId = cieId;
	}
	

	
    
}
