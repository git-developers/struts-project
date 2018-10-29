package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.efact.bean.*;

public class NoteDebitAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private List<Program> listProgram;
	private List<Group> listGroup;
	
    public NoteDebitAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public String index() throws Exception {
		
		ProgramDao productDao = dao.getProgramDao();
		GroupDao groupDao = dao.getGroupDao();
		
		listProgram = productDao.findAll();
		listGroup = groupDao.findAll();
		
		return SUCCESS;
	}

	
}
