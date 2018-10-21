package com.efact.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Locale;

public class VoucherSearch implements Serializable {

    private String program;
    private String group;
    private String bank;
    private String voucher;
    private String status; 
    private String from;    
    private String to;
    
	public int getProgram() {
		return Integer.parseInt(program);
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getGroup() {
		return Integer.parseInt(group);
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getBank() {
		return Integer.parseInt(bank);
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getVoucher() {
		return voucher;
	}
	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}
	public int getStatus() {
		return Integer.parseInt(status);
	}
	public void setStatus(String status) {
		this.status = status;
	}
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

        Date date = null;
        
		try {
	    	dateString = dateString.trim().equals("") ? "1980-01-01" : dateString;
	        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			date = (Date) format.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        return date;
    }
    
    
}
