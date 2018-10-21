package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface ProgramDao {

	public List<Program> findAll() throws Exception;
	public Program findOneById(String id) throws Exception;
	
}
