package com.efact.bean;

import java.io.Serializable;
import com.efact.util.Util;

public class AccruedIssue implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int recaudoId;
	private String datosAsociados; 
	private int numeroCuota; 
	private int posicion;
	private String descripcion; 
	private String afecto; 
	private String noAfecto; 
	private String igv;
	private String total;
	private String resultado; 
	private boolean status;
	private String codigoAsociado; 
	
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
	public int getQueryDateTo() {
		return Util.strDateToInt(queryDateTo);
	}
	public void setQueryDateTo(String queryDateTo) {
		this.queryDateTo = queryDateTo;
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
	public String getCodigoAsociado() {
		return codigoAsociado;
	}
	public void setCodigoAsociado(String codigoAsociado) {
		this.codigoAsociado = codigoAsociado;
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
