package com.efact.bean;

import java.io.Serializable;

public class Series implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private int id;
    private int voucherId;
    private String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getVoucherId() {
		return voucherId;
	}
	public void setVoucherId(int voucherId) {
		this.voucherId = voucherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
