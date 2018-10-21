package com.efact.dao.interfaces;

import java.util.Vector;
import java.util.List;
import com.efact.bean.Program;

public interface ProgramDao {

	public List<Program> listAll() throws Exception;
	public Vector<Program> findAll() throws Exception;
	public Program findOneById(String id) throws Exception;
	
}
