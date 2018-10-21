package com.efact.bean;

import java.io.Serializable;

public class Voucher implements Serializable {

    private String nro;
    private boolean flag;
    private String programa;
    private String asociado;
    private String contrato;
    private String datos;
    private String fecha;  
    private String abono;
    private String conciliado;
    private String diferido;
    private String devengado;
    private String codcierre;
    private String sistema;    
    private int eaid;    
    private int recid;
    
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getAsociado() {
		return asociado;
	}
	public void setAsociado(String asociado) {
		this.asociado = asociado;
	}
	public String getContrato() {
		return contrato;
	}
	public void setContrato(String contrato) {
		this.contrato = contrato;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getAbono() {
		return abono;
	}
	public void setAbono(String abono) {
		this.abono = abono;
	}
	public String getConciliado() {
		return conciliado;
	}
	public void setConciliado(String conciliado) {
		this.conciliado = conciliado;
	}
	public String getDiferido() {
		return diferido;
	}
	public void setDiferido(String diferido) {
		this.diferido = diferido;
	}
	public String getDevengado() {
		return devengado;
	}
	public void setDevengado(String devengado) {
		this.devengado = devengado;
	}
	public String getCodcierre() {
		return codcierre;
	}
	public void setCodcierre(String codcierre) {
		this.codcierre = codcierre;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public int getEaid() {
		return eaid;
	}
	public void setEaid(int eaid) {
		this.eaid = eaid;
	}
	public int getRecid() {
		return recid;
	}
	public void setRecid(int recid) {
		this.recid = recid;
	}
	
}
