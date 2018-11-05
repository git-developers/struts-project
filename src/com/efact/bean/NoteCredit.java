package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.efact.util.Dates;
import com.efact.util.Util;

public class NoteCredit implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private int id;
    private int numero;
    private int serie;
    private String contrato;
    private String datos;
    private String fechaEmision;
    private String fechaVencimiento;
    private String bd;
    private int tipoDocDestino;
    private Date fechaEmisionDestino;
    private float igv;
    private String resultado;
    
    private List<NoteCreditDetail> listNoteCreditDetail;
    private String numeroOut;
    private String serieOut;
    private String comprobanteOrigen;
    
    private float noAfecto_1;
    private float afecto_1;

    private float noAfecto_2;
    private float afecto_2;

    private float noAfecto_3;
    private float afecto_3;

    private float noAfecto_4;
    private float afecto_4;

    private float noAfecto_5;
    private float afecto_5;

    private float noAfecto_6;
    private float afecto_6;

    private float noAfecto_7;
    private float afecto_7;

    private float noAfecto_8;
    private float afecto_8;


    private String queryVoucher;
    private String querySerie;
    private String queryNumber;
    private String queryMoneyIntoWords;
    private String queryNoteCreditType;
    
    
    private float queryTotal;
    
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
	
	public String getFechaEmision() {
		return Dates.strToDate(fechaEmision);
	}
	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getFechaVencimiento() {
		return Dates.strToDate(fechaVencimiento);
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getFechaEmisionInt() {
		return Util.strDateToInt(fechaEmision);
	}
	public int getFechaVencimientoInt() {
		return Util.strDateToInt(fechaVencimiento);
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
	public String getQueryNoteCreditType() {
		return queryNoteCreditType;
	}
	public void setQueryNoteCreditType(String queryNoteCreditType) {
		this.queryNoteCreditType = queryNoteCreditType;
	}
	public String getNumeroOut() {
		return numeroOut;
	}
	public void setNumeroOut(String numeroOut) {
		this.numeroOut = numeroOut;
	}
	public String getSerieOut() {
		return serieOut;
	}
	public void setSerieOut(String serieOut) {
		this.serieOut = serieOut;
	}
	
	public float getNoAfecto_1() {
		return noAfecto_1;
	}
	public void setNoAfecto_1(float noAfecto_1) {
		this.noAfecto_1 = noAfecto_1;
	}
	public float getAfecto_1() {
		return afecto_1;
	}
	public void setAfecto_1(float afecto_1) {
		this.afecto_1 = afecto_1;
	}
	public float getNoAfecto_2() {
		return noAfecto_2;
	}
	public void setNoAfecto_2(float noAfecto_2) {
		this.noAfecto_2 = noAfecto_2;
	}
	public float getAfecto_2() {
		return afecto_2;
	}
	public void setAfecto_2(float afecto_2) {
		this.afecto_2 = afecto_2;
	}
	public float getNoAfecto_3() {
		return noAfecto_3;
	}
	public void setNoAfecto_3(float noAfecto_3) {
		this.noAfecto_3 = noAfecto_3;
	}
	public float getAfecto_3() {
		return afecto_3;
	}
	public void setAfecto_3(float afecto_3) {
		this.afecto_3 = afecto_3;
	}
	public float getNoAfecto_4() {
		return noAfecto_4;
	}
	public void setNoAfecto_4(float noAfecto_4) {
		this.noAfecto_4 = noAfecto_4;
	}
	public float getAfecto_4() {
		return afecto_4;
	}
	public void setAfecto_4(float afecto_4) {
		this.afecto_4 = afecto_4;
	}
	public float getNoAfecto_5() {
		return noAfecto_5;
	}
	public void setNoAfecto_5(float noAfecto_5) {
		this.noAfecto_5 = noAfecto_5;
	}
	public float getAfecto_5() {
		return afecto_5;
	}
	public void setAfecto_5(float afecto_5) {
		this.afecto_5 = afecto_5;
	}
	public float getNoAfecto_6() {
		return noAfecto_6;
	}
	public void setNoAfecto_6(float noAfecto_6) {
		this.noAfecto_6 = noAfecto_6;
	}
	public float getAfecto_6() {
		return afecto_6;
	}
	public void setAfecto_6(float afecto_6) {
		this.afecto_6 = afecto_6;
	}
	public float getNoAfecto_7() {
		return noAfecto_7;
	}
	public void setNoAfecto_7(float noAfecto_7) {
		this.noAfecto_7 = noAfecto_7;
	}
	public float getAfecto_7() {
		return afecto_7;
	}
	public void setAfecto_7(float afecto_7) {
		this.afecto_7 = afecto_7;
	}
	public float getNoAfecto_8() {
		return noAfecto_8;
	}
	public void setNoAfecto_8(float noAfecto_8) {
		this.noAfecto_8 = noAfecto_8;
	}
	public float getAfecto_8() {
		return afecto_8;
	}
	public void setAfecto_8(float afecto_8) {
		this.afecto_8 = afecto_8;
	}
	public float getQueryTotal() {
		return queryTotal;
	}
	public void setQueryTotal(float queryTotal) {
		this.queryTotal = queryTotal;
	}
	public void setAfecto_8(int afecto_8) {
		this.afecto_8 = afecto_8;
	}
	public String getComprobanteOrigen() {
		return comprobanteOrigen;
	}
	public void setComprobanteOrigen(String comprobanteOrigen) {
		this.comprobanteOrigen = comprobanteOrigen;
	}
	public float getIgv() {
		return igv;
	}
	public void setIgv(float igv) {
		this.igv = igv;
	}
	public String getQueryMoneyIntoWords() {
		return queryMoneyIntoWords;
	}
	public void setQueryMoneyIntoWords(String queryMoneyIntoWords) {
		this.queryMoneyIntoWords = queryMoneyIntoWords;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
}
