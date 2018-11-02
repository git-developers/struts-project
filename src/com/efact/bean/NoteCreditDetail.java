package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

import com.efact.util.Util;

public class NoteCreditDetail implements Serializable {

    private String descripcion;
    private String simbolo;
    private float afecto;
    private float igv;
    private float noAfecto;
    private float total;
    
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
	public float getAfecto() {
		return afecto;
	}
	public void setAfecto(float afecto) {
		this.afecto = afecto;
	}
	public float getIgv() {
		return igv;
	}
	public void setIgv(float igv) {
		this.igv = igv;
	}
	public float getNoAfecto() {
		return noAfecto;
	}
	public void setNoAfecto(float noAfecto) {
		this.noAfecto = noAfecto;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
    
    
}
