package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

import com.efact.util.Util;

public class AccruedConciliation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String comprobante1; 
	private String comprobante2; 
	private String recaudo; 
	private String descripcion;
	private String afecto; 
	private String noafecto; 
	private String igv;
	private String total;
	private String reaId;
	private String sistema;
	private String resultado;
	private boolean status;
	
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
	public void setQueryFrom(String queryFrom) {
		this.queryFrom = queryFrom;
	}
	public void setQueryTo(String queryTo) {
		this.queryTo = queryTo;
	}
	public Date getQueryFrom() {
		return Util.strToDate(queryFrom);
	}
	public void setFrom(String from) {
		this.queryFrom = from;
	}
	public Date getQueryTo() {
		return Util.strToDate(queryTo);
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
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getIgv() {
		return igv;
	}
	public void setIgv(String igv) {
		this.igv = igv;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}


}
