package com.efact.bean;

import java.io.Serializable;

import com.efact.util.Util;

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

	public String getEne() {
		return Util.amountFormat(ene, 2);
	}

	public void setEne(double ene) {
		this.ene = ene;
	}

	public String getFeb() {
		return Util.amountFormat(feb, 2);
	}

	public void setFeb(double feb) {
		this.feb = feb;
	}

	public String getMar() {
		return Util.amountFormat(mar, 2);
	}

	public void setMar(double mar) {
		this.mar = mar;
	}

	public String getAbr() {
		return Util.amountFormat(abr, 2);
	}

	public void setAbr(double abr) {
		this.abr = abr;
	}

	public String getMay() {
		return Util.amountFormat(may, 2);
	}

	public void setMay(double may) {
		this.may = may;
	}

	public String getJun() {
		return Util.amountFormat(jun, 2);
	}

	public void setJun(double jun) {
		this.jun = jun;
	}

	public String getJul() {
		return Util.amountFormat(jul, 2);
	}

	public void setJul(double jul) {
		this.jul = jul;
	}

	public String getAgo() {
		return Util.amountFormat(ago, 2);
	}

	public void setAgo(double ago) {
		this.ago = ago;
	}

	public String getSet() {
		return Util.amountFormat(set, 2);
	}

	public void setSet(double set) {
		this.set = set;
	}

	public String getOct() {
		return Util.amountFormat(oct, 2);
	}

	public void setOct(double oct) {
		this.oct = oct;
	}

	public String getNov() {
		return Util.amountFormat(nov, 2);
	}

	public void setNov(double nov) {
		this.nov = nov;
	}

	public String getDic() {
		return Util.amountFormat(dic, 2);
	}

	public void setDic(double dic) {
		this.dic = dic;
	}



}
