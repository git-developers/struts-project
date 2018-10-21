package com.efact.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.Date;

public class VoucherSearch implements Serializable {

    private String program;
    private String group;
    private String bank;
    private String voucher;
    private String status; 
    private String from;    
    private String to;
    
	public int getProgram() {
        try {
        	return Integer.parseInt(program);
         } catch (NumberFormatException e) {
        	 return 0;
         }
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getGroup() {
        try {
        	return Integer.parseInt(group);
         } catch (NumberFormatException e) {
        	 return 0;
         }
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public int getBank() {
        try {
        	return Integer.parseInt(bank);
         } catch (NumberFormatException e) {
        	 return 0;
         }
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
        try {
        	return Integer.parseInt(status);
         } catch (NumberFormatException e) {
        	 return 0;
         }
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
    	dateString = dateString.trim().equals("") ? "1980-01-01" : dateString;
    	return Date.valueOf(dateString);
    }
    
    
}
