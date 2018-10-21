package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.efact.dao.interfaces.*;
import com.efact.bean.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class VoucherAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private List<Program> listProgram;
	private List<Group> listGroup;
	private List<Bank> listBank;
	
    public VoucherAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		
		return "SUCCESS";
	}

	public String index() throws Exception {
		
		ProgramDao productDao = dao.getProgramDao();
		GroupDao groupDao = dao.getGroupDao();
		BankDao bankDao = dao.getBankDao();
		
		listProgram = productDao.findAll();
		listGroup = groupDao.findAll();
		listBank = bankDao.findAll();
		
		for(Program program : listProgram) {
			System.out.print("program :::: " + program.getId() + " - "  + program.getName());
		}
		
		return "SUCCESS";
	}
	
	public String search(HttpServletRequest request, HttpServletResponse response) throws Exception, ServletException {
		
		System.out.print(":::: SEARCH :::: ");
		
        //String fields = request.getParameter("fields");
        
        //System.out.print("FIELDS :::: " + fields);

        //VoucherSearch vs = gson.fromJson(fields, VoucherSearch.class);
        
        //System.out.print("VoucherSearch :::: " + vs.getProgram() + " - "  + vs.getGroup());
        
		return "SUCCESS";
	}

	public List<Program> getListProgram() {
		return listProgram;
	}

	public void setListProgram(List<Program> listProgram) {
		this.listProgram = listProgram;
	}

	public List<Group> getListGroup() {
		return listGroup;
	}

	public void setListGroup(List<Group> listGroup) {
		this.listGroup = listGroup;
	}

	public List<Bank> getListBank() {
		return listBank;
	}

	public void setListBank(List<Bank> listBank) {
		this.listBank = listBank;
	}
	
	

	
}
