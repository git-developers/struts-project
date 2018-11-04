package com.efact.bean;

import java.io.Serializable;


public class NoteCreditDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
//    private String descripcion;
//    private String simbolo;
//    private String afecto;
//    private String igv;
//    private String noAfecto;
//    private String total;
//    private String recaudo;
//	
//    RVD.RVB_DESCRIPCION CO_RVB_DESCRIPCION,
//    M.SIMBOLO CO_SIMBOLO,
//    trim(to_char(round(RVD.RVB_NOAFECTO,2),'999,999.99')) as CO_RVB_NOAFECTO,
//    trim(to_char(round(RVD.RVB_AFECTO,2),'999,999.99')) as CO_RVB_AFECTO,
//    trim(to_char(round(RVD.RVB_IGV,2),'999,999.99')) as CO_RVB_IGV,
//    trim(to_char(round(RVD.RVB_TOTAL,2),'999,999.99')) as CO_RVB_TOTAL,
//    
//    -- LISTAD0 DE Nota de crédito
//    
//    RVD.RVS_RECAUDO NC_RVS_RECAUDO,
//    RVD.RVB_DESCRIPCION NC_RVB_CONCEPTO,
//    trim(to_char(round(RVD.RVB_NOAFECTO,2),'999,999.99')) as NC_RVB_NOAFECTO,
//    trim(to_char(round(RVD.RVB_AFECTO,2),'999,999.99')) as NC_RVB_AFECTO,
//    trim(to_char(round(RVD.RVB_IGV,2),'999,999.99')) as NC_RVB_IGV,
//    trim(to_char(round(RVD.RVB_TOTAL,2),'999,999.99')) as NC_RVB_TOTAL
//    
	private String COdescripcion;
	private String COsimbolo;
	private String COnoAfecto;
	private String COafecto;
	private String COigv;
	private String COtotal;
	
	private String NCrecaudo;
	private String NCconcepto;
	private String NCnoAfecto;
	private String NCafecto;
	private String NCigv;
	private String NCtotal;
  
    private float afectoSum;
    private float noAfectoSum;
    private float igvSum;
    private float totalSum;
    
	public String getCOdescripcion() {
		return COdescripcion;
	}
	public void setCOdescripcion(String cOdescripcion) {
		COdescripcion = cOdescripcion;
	}
	public String getCOsimbolo() {
		return COsimbolo;
	}
	public void setCOsimbolo(String cOsimbolo) {
		COsimbolo = cOsimbolo;
	}
	public String getCOnoAfecto() {
		return COnoAfecto;
	}
	public void setCOnoAfecto(String cOnoAfecto) {
		COnoAfecto = cOnoAfecto;
	}
	public String getCOafecto() {
		return COafecto;
	}
	public void setCOafecto(String cOafecto) {
		COafecto = cOafecto;
	}
	public String getCOigv() {
		return COigv;
	}
	public void setCOigv(String cOigv) {
		COigv = cOigv;
	}
	public String getCOtotal() {
		return COtotal;
	}
	public void setCOtotal(String cOtotal) {
		COtotal = cOtotal;
	}
	public String getNCrecaudo() {
		return NCrecaudo;
	}
	public void setNCrecaudo(String nCrecaudo) {
		NCrecaudo = nCrecaudo;
	}
	public String getNCconcepto() {
		return NCconcepto;
	}
	public void setNCconcepto(String nCconcepto) {
		NCconcepto = nCconcepto;
	}
	public String getNCnoAfecto() {
		return NCnoAfecto;
	}
	public void setNCnoAfecto(String nCnoAfecto) {
		NCnoAfecto = nCnoAfecto;
	}
	public String getNCafecto() {
		return NCafecto;
	}
	public void setNCafecto(String nCafecto) {
		NCafecto = nCafecto;
	}
	public String getNCigv() {
		return NCigv;
	}
	public void setNCigv(String nCigv) {
		NCigv = nCigv;
	}
	public String getNCtotal() {
		return NCtotal;
	}
	public void setNCtotal(String nCtotal) {
		NCtotal = nCtotal;
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
    

}
