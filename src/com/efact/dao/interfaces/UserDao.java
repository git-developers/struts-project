package com.efact.dao.interfaces;

import java.util.Vector;

import com.efact.bean.*;

public interface UserDao {

	public int create(User object) throws Exception;
	public boolean delete(int id) throws Exception;
	public Vector<User> findAll() throws Exception;
	public User findOneById(String id) throws Exception;
	public int update(User object) throws Exception;
	
}
