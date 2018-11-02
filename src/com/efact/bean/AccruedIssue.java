package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

import com.efact.util.Util;

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
	private int queryCieId;
    
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
	public int getQueryProgram() {
		return Util.strToInt(queryProgram);
	}
	public void setQueryProgram(String queryProgram) {
		this.queryProgram = queryProgram;
	}
	public int getQueryGroup() {
		return Util.strToInt(queryGroup);
	}
	public void setQueryGroup(String queryGroup) {
		this.queryGroup = queryGroup;
	}
	public String getQueryDateTo() {
		return queryDateTo;
	}
	public void setQueryDateTo(String queryDateTo) {
		this.queryDateTo = queryDateTo;
	}
	public int getQueryCieId() {
		return queryCieId;
	}
	public void setQueryCieId(int queryCieId) {
		this.queryCieId = queryCieId;
	}


}
