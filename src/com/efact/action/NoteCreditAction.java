package com.efact.action;

import com.efact.dao.factory.DaoFactory;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.util.Dates;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.efact.bean.*;

public class NoteCreditAction extends ActionSupportBase implements ServletRequestAware, ServletResponseAware  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private NoteCredit noteCredit;
	private List<NoteCreditType> listNoteCreditType;
	private List<VoucherDropdown> listVoucherDropdown;
	private List<Series> listSeries;
	private String currentDate;
	
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public NoteCreditAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String index() throws Exception {
		
        NoteCreditDao ncDao = dao.getNoteCreditDao();
		VoucherDao voucherDao = dao.getVoucherDao();
		
        listVoucherDropdown = voucherDao.listVoucherDropdown(Const.MODULE_NOTE_CREDIT);
        listSeries = ncDao.listSeries();
        
		return SUCCESS;
	}

	public String search() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteCredit ncObj = gson.fromJson(serializeToJSON(fields), NoteCredit.class);
        
        NoteCreditDao ncDao = dao.getNoteCreditDao();
        noteCredit = ncDao.search(ncObj);  
        listNoteCreditType = ncDao.listNoteCreditType();
		currentDate = Dates.getCurrentDate();
        
		return SUCCESS;
	}

	public String process() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteCredit ncObj = gson.fromJson(fields, NoteCredit.class);
		
        NoteCreditDao ncDao = dao.getNoteCreditDao();
        noteCredit = ncDao.process(ncObj);
        
		return SUCCESS;
	}

	public List<Series> getListSeries() {
		return listSeries;
	}


	public void setListSeries(List<Series> listSeries) {
		this.listSeries = listSeries;
	}


	public List<NoteCreditType> getListNoteCreditType() {
		return listNoteCreditType;
	}


	public void setListNoteCreditType(List<NoteCreditType> listNoteCreditType) {
		this.listNoteCreditType = listNoteCreditType;
	}


	public NoteCredit getNoteCredit() {
		return noteCredit;
	}


	public void setNoteCredit(NoteCredit noteCredit) {
		this.noteCredit = noteCredit;
	}


	@Override
	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}


	public List<VoucherDropdown> getListVoucherDropdown() {
		return listVoucherDropdown;
	}


	public void setListVoucherDropdown(List<VoucherDropdown> listVoucherDropdown) {
		this.listVoucherDropdown = listVoucherDropdown;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
