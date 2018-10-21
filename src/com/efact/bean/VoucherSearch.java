package com.efact.bean;

import java.io.Serializable;
import java.util.Date;

public class VoucherSearch implements Serializable {

    private int program;
    private int group;
    private int bank;
    private int voucher;
    private int status; 
    private Date from;    
    private Date to;
	public int getProgram() {
		return program;
	}
	public void setProgram(int program) {
		this.program = program;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public int getBank() {
		return bank;
	}
	public void setBank(int bank) {
		this.bank = bank;
	}
	public int getVoucher() {
		return voucher;
	}
	public void setVoucher(int voucher) {
		this.voucher = voucher;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
    
    
    
}
