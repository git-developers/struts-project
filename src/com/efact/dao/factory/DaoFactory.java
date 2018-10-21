package com.efact.dao.factory;

import com.efact.dao.interfaces.ProgramDao;
import com.efact.dao.interfaces.UserDao;

public abstract class DaoFactory {

	public static final int MYSQL 	  = 1;
	public static final int SQLSERVER = 2;
	public static final int ORACLE 	  = 3;

	public abstract UserDao getUserDao();
	public abstract ProgramDao getProgramDao();

	public static DaoFactory getDAOFactory(int factory){
		
		switch (factory) {
			case MYSQL:
				return new MySqlDaoFactory();
			case SQLSERVER:
				return new SqlDaoFactory();
			case ORACLE:
				return new OracleDaoFactory();
			default:
				return null;
		}
	}
}
