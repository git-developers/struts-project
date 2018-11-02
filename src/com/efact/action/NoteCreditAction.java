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
		return SUCCESS;
	}

	public String search() throws Exception {
		
        String fields = request.getParameter("fields");
        NoteCredit ncObj = gson.fromJson(serializeToJSON(fields), NoteCredit.class);
        
        System.out.print("search -- JSON ::::: " + serializeToJSON(fields) );
        
        NoteCreditDao ncDao = dao.getNoteCreditDao();
        noteCredit = ncDao.search(ncObj);
        
		return SUCCESS;
	}

	public String process() throws Exception {
		return SUCCESS;
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
}
