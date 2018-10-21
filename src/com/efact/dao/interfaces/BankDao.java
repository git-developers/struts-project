package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface BankDao {

	public List<Bank> findAll() throws Exception;
	public Bank findOneById(String id) throws Exception;
	
}
