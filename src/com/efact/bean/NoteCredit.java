package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.efact.util.Util;

public class NoteCredit implements Serializable {

    private int id;
    private int numero;
    private int serie;
    private String contrato;
    private String datos;
    private int fechaEmision;
    private int fechaVencimiento;
    private String bd;
    private int tipoDocDestino;
    private Date fechaEmisionDestino;
    private List<NoteCreditDetail> listNoteCreditDetail;
    
    private String queryVoucher;
    private String querySerie;
    private String queryNumber;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQueryVoucher() {
		return Util.strToInt(queryVoucher);
	}
	public void setQueryVoucher(String queryVoucher) {
		this.queryVoucher = queryVoucher;
	}
	public int getQuerySerie() {
		return Util.strToInt(querySerie);
	}
	public void setQuerySerie(String querySerie) {
		this.querySerie = querySerie;
	}
	public int getQueryNumber() {
		return Util.strToInt(queryNumber);
	}
	public void setQueryNumber(String queryNumber) {
		this.queryNumber = queryNumber;
	}
	public List<NoteCreditDetail> getListNoteCreditDetail() {
		return listNoteCreditDetail;
	}
	public void setListNoteCreditDetail(List<NoteCreditDetail> listNoteCreditDetail) {
		this.listNoteCreditDetail = listNoteCreditDetail;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
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
	public int getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(int fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public int getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(int fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getBd() {
		return bd;
	}
	public void setBd(String bd) {
		this.bd = bd;
	}
	public int getTipoDocDestino() {
		return tipoDocDestino;
	}
	public void setTipoDocDestino(int tipoDocDestino) {
		this.tipoDocDestino = tipoDocDestino;
	}
	public Date getFechaEmisionDestino() {
		return fechaEmisionDestino;
	}
	public void setFechaEmisionDestino(Date fechaEmisionDestino) {
		this.fechaEmisionDestino = fechaEmisionDestino;
	}
	
}
