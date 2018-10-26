package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class AccruedIssue implements Serializable {
	
	private int recaudoId;
	private String datosAsociados; 
	private int numeroCuota; 
	private int posicion;
	private String descripcion; 
	private String afecto; 
	private String noAfecto; 
	private float igv;
	private float total;
	
    private String queryProgram;    
    private String queryGroup;
    private String queryDateTo;
    
    
	public int getRecaudoId() {
		return recaudoId;
	}
	public void setRecaudoId(int recaudoId) {
		this.recaudoId = recaudoId;
	}
	public String getDatosAsociados() {
		return datosAsociados;
	}
	public void setDatosAsociados(String datosAsociados) {
		this.datosAsociados = datosAsociados;
	}
	public int getNumeroCuota() {
		return numeroCuota;
	}
	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
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
	public String getNoAfecto() {
		return noAfecto;
	}
	public void setNoAfecto(String noAfecto) {
		this.noAfecto = noAfecto;
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
	public int getProgram() {
        try {
        	return Integer.parseInt(queryProgram);
         } catch (NumberFormatException e) {
        	 return 0;
         }
	}
	public void setQueryProgram(String queryProgram) {
		this.queryProgram = queryProgram;
	}
	public int getGroup() {
        try {
        	return Integer.parseInt(queryGroup);
         } catch (NumberFormatException e) {
        	 return 0;
         }
	}
	public void setQueryGroup(String queryGroup) {
		this.queryGroup = queryGroup;
	}
	public String getDateTo() {
		//return stringToDate(queryDateTo);
		return queryDateTo;
	}
	public void setQueryDateTo(String queryDateTo) {
		this.queryDateTo = queryDateTo;
	}
	
//    private Date stringToDate(String dateString){
//    	dateString = dateString.trim().equals("") ? "1980-01-01" : dateString;
//    	return Date.valueOf(dateString);
//    }

}
