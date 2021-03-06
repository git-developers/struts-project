package com.efact.bean;

import java.io.Serializable;

public class VoucherDropdown implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
    private String name;
    private String shortName;
    
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
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
