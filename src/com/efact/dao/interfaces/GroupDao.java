package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface GroupDao {

	public List<Group> findAll() throws Exception;
	public Group findOneById(String id) throws Exception;
	
}
