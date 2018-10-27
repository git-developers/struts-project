package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class Sequence implements Serializable {

    private int id;
    private String name;
    
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
    
    
	
}
