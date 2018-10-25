package com.efact.dao.oracle;

import java.util.Vector;

import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.dao.factory.OracleDaoFactory;

public class UserImpDao extends OracleDaoFactory implements UserDao  {

	@Override
	public int create(User object) throws Exception {
		return 0;
	}

	@Override
	public boolean delete(int id) throws Exception {
		return false;
	}

	@Override
	public Vector<User> findAll() throws Exception {
		return null;
	}

	@Override
	public User findOneById(String id) throws Exception {
		return null;
	}

	@Override
	public int update(User object) throws Exception {
		return 0;
	}

}
