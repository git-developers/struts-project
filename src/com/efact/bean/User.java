package com.efact.bean;

import java.io.Serializable;
import java.security.Timestamp;

public class User implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private byte active;
	private Timestamp created;
	
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
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public Timestamp getCreated() {
		return created;
	}
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	
}
