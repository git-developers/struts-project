package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface SequenceDao {

	public List<Sequence> findAll() throws Exception;
	public Sequence findOneById(String id) throws Exception;
	
}
