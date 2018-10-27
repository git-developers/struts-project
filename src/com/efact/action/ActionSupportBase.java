package com.efact.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.efact.util.Dates;
import com.google.gson.JsonObject;
import com.opensymphony.xwork2.ActionSupport;

public class ActionSupportBase extends ActionSupport {

	private String contextPath;
	private String currentDateTime;

	ActionSupportBase() { 
		currentDateTime = Dates.getCurrentDateTime();
    } 
    
	public static String serializeToJSON(String query) throws UnsupportedEncodingException {

		JsonObject json = new JsonObject();
	    
	    String[] pairs = query.split("&");
	    
	    for (String pair : pairs) {
	        int idx = pair.indexOf("=");
	        json.addProperty(URLDecoder.decode(pair.substring(0, idx), "UTF-8"), URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
	    }
	    
	    return json.toString();
	}
	
	public String getContextPath() {
		return "GGGGGGG";
		//return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public String getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}


}
