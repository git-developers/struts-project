package com.efact.bean;

import java.io.Serializable;

public class NoteCreditDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String descripcion;
    private String simbolo;
    private String afecto;
    private String igv;
    private String noAfecto;
    private String total;
    
    private float afectoSum;
    private float noAfectoSum;
    private float igvSum;
    private float totalSum;
    
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	public float getAfectoSum() {
		return afectoSum;
	}
	public void setAfectoSum(float afectoSum) {
		this.afectoSum = afectoSum;
	}
	public float getNoAfectoSum() {
		return noAfectoSum;
	}
	public void setNoAfectoSum(float noAfectoSum) {
		this.noAfectoSum = noAfectoSum;
	}
	public float getIgvSum() {
		return igvSum;
	}
	public void setIgvSum(float igvSum) {
		this.igvSum = igvSum;
	}
	public float getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(float totalSum) {
		this.totalSum = totalSum;
	}
	public String getAfecto() {
		return afecto;
	}
	public void setAfecto(String afecto) {
		this.afecto = afecto;
	}
	public String getIgv() {
		return igv;
	}
	public void setIgv(String igv) {
		this.igv = igv;
	}
	public String getNoAfecto() {
		return noAfecto;
	}
	public void setNoAfecto(String noAfecto) {
		this.noAfecto = noAfecto;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
    
    
}
