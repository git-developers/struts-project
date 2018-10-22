package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class Accrued implements Serializable {

    private String from;    
    private String to;
	
	public Date getFrom() {
		return stringToDate(from);
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Date getTo() {
		return stringToDate(to);
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
    private Date stringToDate(String dateString){
    	dateString = dateString.trim().equals("") ? "1980-01-01" : dateString;
    	return Date.valueOf(dateString);
    }
    
    
}
