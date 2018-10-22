package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.efact.dao.interfaces.*;
import com.efact.dao.oracle.*;

public class SqlServerDaoFactory extends DaoFactory {

	protected static Connection connection;
	
	public static Connection getMainConnection(){
		
		try {
			
		    String JDBC_DRIVER = "";
		    String DB_URL = "";    
		    String USER = "root";
		    String PASS = "root";
			
			Class.forName(JDBC_DRIVER);		
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
			System.out.print("SYSTEM INFO::: Connection Failed!");
			e.printStackTrace();
		}
		
		return connection;
	}
	
    public void closeConnection() throws SQLException {
        if(connection != null){
            if(!connection.isClosed()){
            	connection.close();
            }
        }
    }
	
	@Override
	public UserDao getUserDao(){
		return null;
	}
	
	@Override
	public ProgramDao getProgramDao() {
		return null;
	}

	@Override
	public GroupDao getGroupDao() {
		return null;
	}

	@Override
	public BankDao getBankDao() {
		return null;
	}

	@Override
	public VoucherDao getVoucherDao() {
		return null;
	}

	@Override
	public AccruedDao getAccruedDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
