package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class ReportSalesRecord implements Serializable {

    private int id;
    private String name;
    
    private String querySequence;
    private String queryFrom;    
    private String queryTo;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuerySequence() {
		return Integer.parseInt(querySequence);
	}
	public void setQuerySequence(String querySequence) {
		this.querySequence = querySequence;
	}
	public float getQueryFrom() {
		return Float.valueOf(queryFrom.replace("-", ""));
	}
	public void setQueryFrom(String queryFrom) {
		this.queryFrom = queryFrom;
	}
	public float getQueryTo() {
		return Float.valueOf(queryTo.replace("-", ""));
	}
	public void setQueryTo(String queryTo) {
		this.queryTo = queryTo;
	}
    
    
	
}
