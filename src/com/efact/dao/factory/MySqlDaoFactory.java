package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.efact.dao.interfaces.*;
import com.efact.dao.oracle.*;

public class MySqlDaoFactory extends DaoFactory {

	protected static Connection connection;
	
	public static Connection getMainConnection(){
		
		try {
		    
			ResourceBundle rb = ResourceBundle.getBundle("parameters");
			
			String driver = rb.getString("mysql.jdbc.driver");
			String url = rb.getString("mysql.db.url");
			String user = rb.getString("mysql.user");
			String pass = rb.getString("mysql.pass");
		    
			Class.forName(driver);	
			connection = DriverManager.getConnection(url, user, pass);
			
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
		return null;
	}

}
