package com.efact.bean;

import java.io.Serializable;

public class ReportSalesSummary implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String year;
    private String tipo;
    private String serie;
    private String programa;
    private double ene;
    private double feb;
    private double mar;
    private double abr;
    private double may;
    private double jun;
    private double jul;
    private double ago;
    private double set;
    private double oct;
    private double nov;
    private double dic;

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

	public double getEne() {
		return ene;
	}

	public void setEne(double ene) {
		this.ene = ene;
	}

	public double getFeb() {
		return feb;
	}

	public void setFeb(double feb) {
		this.feb = feb;
	}

	public double getMar() {
		return mar;
	}

	public void setMar(double mar) {
		this.mar = mar;
	}

	public double getAbr() {
		return abr;
	}

	public void setAbr(double abr) {
		this.abr = abr;
	}

	public double getMay() {
		return may;
	}

	public void setMay(double may) {
		this.may = may;
	}

	public double getJun() {
		return jun;
	}

	public void setJun(double jun) {
		this.jun = jun;
	}

	public double getJul() {
		return jul;
	}

	public void setJul(double jul) {
		this.jul = jul;
	}

	public double getAgo() {
		return ago;
	}

	public void setAgo(double ago) {
		this.ago = ago;
	}

	public double getSet() {
		return set;
	}

	public void setSet(double set) {
		this.set = set;
	}

	public double getOct() {
		return oct;
	}

	public void setOct(double oct) {
		this.oct = oct;
	}

	public double getNov() {
		return nov;
	}

	public void setNov(double nov) {
		this.nov = nov;
	}

	public double getDic() {
		return dic;
	}

	public void setDic(double dic) {
		this.dic = dic;
	}



}
