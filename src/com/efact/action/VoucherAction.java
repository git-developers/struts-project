package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import com.efact.dao.interfaces.*;
import com.efact.bean.*;

public class VoucherAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private List<Program> listProgram;
	private List<Group> listGroup;
	private List<Bank> listBank;
	
    public VoucherAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
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
	
	public String search() throws Exception {
		
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
