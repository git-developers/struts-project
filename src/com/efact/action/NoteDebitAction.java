package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.bean.*;

public class NoteDebitAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	
	@Override
	public String execute() throws Exception {
		
		return Const.SUCCESS;
	}

	public String index() throws Exception {
		
		return Const.SUCCESS;
	}

	
}
