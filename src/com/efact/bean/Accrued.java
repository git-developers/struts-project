package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class Accrued implements Serializable {
	
	private String comprobante1; 
	private String comprobante2; 
	private String recaudo; 
	private String descripcion;
	private String afecto; 
	private String noafecto; 
	private float igv;
	private float total;
	private String reaId;
	private String sistema;
	
    private String queryFrom;    
    private String queryTo;
    

	public String getComprobante1() {
		return comprobante1;
	}
	public void setComprobante1(String comprobante1) {
		this.comprobante1 = comprobante1;
	}
	public String getComprobante2() {
		return comprobante2;
	}
	public void setComprobante2(String comprobante2) {
		this.comprobante2 = comprobante2;
	}
	public String getRecaudo() {
		return recaudo;
	}
	public void setRecaudo(String recaudo) {
		this.recaudo = recaudo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAfecto() {
		return afecto;
	}
	public void setAfecto(String afecto) {
		this.afecto = afecto;
	}
	public String getNoafecto() {
		return noafecto;
	}
	public void setNoafecto(String noafecto) {
		this.noafecto = noafecto;
	}
	public float getIgv() {
		return igv;
	}
	public void setIgv(float igv) {
		this.igv = igv;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getQueryFrom() {
		return queryFrom;
	}
	public void setQueryFrom(String queryFrom) {
		this.queryFrom = queryFrom;
	}
	public String getQueryTo() {
		return queryTo;
	}
	public void setQueryTo(String queryTo) {
		this.queryTo = queryTo;
	}
	public Date getFrom() {
		return stringToDate(queryFrom);
	}
	public void setFrom(String from) {
		this.queryFrom = from;
	}
	public Date getTo() {
		return stringToDate(queryTo);
	}
	
	public void setTo(String to) {
		this.queryTo = to;
	}

    public String getReaId() {
		return reaId;
	}
	public void setReaId(String reaId) {
		this.reaId = reaId;
	}
	
	
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	private Date stringToDate(String dateString){
    	dateString = dateString.trim().equals("") ? "1980-01-01" : dateString;
    	return Date.valueOf(dateString);
    }
    
    
}
