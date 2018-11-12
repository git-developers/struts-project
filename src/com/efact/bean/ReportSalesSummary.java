package com.efact.bean;

import java.io.Serializable;

public class ReportSalesSummary implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String year;
    private String tipo;
    private String serie;
    private String programa;
    private float ene;
    private float feb;
    private float mar;
    private float abr;
    private float may;
    private float jun;
    private float jul;
    private float ago;
    private float set;
    private float oct;
    private float nov;
    private float dic;

    private int queryYear;


	public int getQueryYear() {
		return queryYear;
	}

	public void setQueryYear(int queryYear) {
		this.queryYear = queryYear;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public float getEne() {
		return ene;
	}

	public void setEne(float ene) {
		this.ene = ene;
	}

	public float getFeb() {
		return feb;
	}

	public void setFeb(float feb) {
		this.feb = feb;
	}

	public float getMar() {
		return mar;
	}

	public void setMar(float mar) {
		this.mar = mar;
	}

	public float getAbr() {
		return abr;
	}

	public void setAbr(float abr) {
		this.abr = abr;
	}

	public float getMay() {
		return may;
	}

	public void setMay(float may) {
		this.may = may;
	}

	public float getJun() {
		return jun;
	}

	public void setJun(float jun) {
		this.jun = jun;
	}

	public float getJul() {
		return jul;
	}

	public void setJul(float jul) {
		this.jul = jul;
	}

	public float getAgo() {
		return ago;
	}

	public void setAgo(float ago) {
		this.ago = ago;
	}

	public float getSet() {
		return set;
	}

	public void setSet(float set) {
		this.set = set;
	}

	public float getOct() {
		return oct;
	}

	public void setOct(float oct) {
		this.oct = oct;
	}

	public float getNov() {
		return nov;
	}

	public void setNov(float nov) {
		this.nov = nov;
	}

	public float getDic() {
		return dic;
	}

	public void setDic(float dic) {
		this.dic = dic;
	}



}
