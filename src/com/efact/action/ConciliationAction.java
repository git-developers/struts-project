package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import com.efact.dao.interfaces.*;
import com.efact.bean.*;

public class ConciliationAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	
	@Override
	public String execute() throws Exception {
		
		return "SUCCESS";
	}

	public String accruedConciliation() throws Exception {
		
		return "SUCCESS";
	}
	
	public String issueConciliation() throws Exception {
		
		return "SUCCESS";
	}
	
	
	public String index() throws Exception {
		
		return "SUCCESS";
	}
	
	public String filter() throws Exception {
		
		
		return "SUCCESS";
	}
	
}
