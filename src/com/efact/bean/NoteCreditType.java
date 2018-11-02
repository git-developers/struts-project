package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.efact.util.Util;

public class NoteCreditType implements Serializable {

    private String id;
    private String name;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
