package com.efact.bean;

import java.io.Serializable;

public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private int id;
    private int prodId;
    private String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
