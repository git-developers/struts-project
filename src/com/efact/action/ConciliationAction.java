package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import com.efact.dao.interfaces.ProgramDao;
import com.efact.dao.interfaces.UserDao;
import com.efact.bean.Program;
import java.util.List;

public class ConciliationAction extends ActionSupportBase  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	
	@Override
	public String execute() throws Exception {
		
		/*
		if("pankaj".equals(getName()) && "admin".equals(getPwd()))
		return "SUCCESS";
		else return "ERROR";
		*/
		
		return "SUCCESS";
	}
	
	public String index() throws Exception {
		
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		//UserDao userDao = dao.getUserDao();
		ProgramDao productDao = dao.getProgramDao();
		
		List<Program> list = productDao.listAll();
		
		for(Program program : list) {
			System.out.print("program :::: " + program.getId() + " - "  + program.getName());
		}
		
		/*
        List<Conciliacion> listaConciliacion = null;

        listaConciliacion = userDao.listar(codPrograma,
                codGrupo,
                codBanco,
                tipComprobante,
                estado,
                dFechaInicio,
                dFechaFin);
		*/
		
		return "SUCCESS";
	}
	
	public String filter() throws Exception {
		
		
		return "SUCCESS";
	}
	
}
