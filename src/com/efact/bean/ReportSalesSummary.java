package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

public class ReportSalesSummary implements Serializable {

    private String year;
    private String tipo;
    private String serie;
    private String programa;
    private int ene;
    private int feb;
    private int mar;
    private int abr;
    private int may;
    private int jun;
    private int jul;
    private int ago;
    private int set;
    private int oct;
    private int nov;
    private int dic;

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

	public int getEne() {
		return ene;
	}

	public void setEne(int ene) {
		this.ene = ene;
	}

	public int getFeb() {
		return feb;
	}

	public void setFeb(int feb) {
		this.feb = feb;
	}

	public int getMar() {
		return mar;
	}

	public void setMar(int mar) {
		this.mar = mar;
	}

	public int getAbr() {
		return abr;
	}

	public void setAbr(int abr) {
		this.abr = abr;
	}

	public int getMay() {
		return may;
	}

	public void setMay(int may) {
		this.may = may;
	}

	public int getJun() {
		return jun;
	}

	public void setJun(int jun) {
		this.jun = jun;
	}

	public int getJul() {
		return jul;
	}

	public void setJul(int jul) {
		this.jul = jul;
	}

	public int getAgo() {
		return ago;
	}

	public void setAgo(int ago) {
		this.ago = ago;
	}

	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getOct() {
		return oct;
	}

	public void setOct(int oct) {
		this.oct = oct;
	}

	public int getNov() {
		return nov;
	}

	public void setNov(int nov) {
		this.nov = nov;
	}

	public int getDic() {
		return dic;
	}

	public void setDic(int dic) {
		this.dic = dic;
	}


}
