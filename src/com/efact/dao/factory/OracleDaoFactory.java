package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import com.efact.dao.interfaces.*;
import com.efact.dao.oracle.*;

public class OracleDaoFactory extends DaoFactory {

	protected static Connection connection;

	public static Connection getMainConnection(){
		
		try {

			ResourceBundle rb = ResourceBundle.getBundle("parameters");
			
			String driver = rb.getString("oracle.jdbc.driver");
			String url = rb.getString("oracle.db.url");
			String user = rb.getString("oracle.user");
			String pass = rb.getString("oracle.pass");
		    
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
		return new UserImpDao();
	}
	
	@Override
	public ProgramDao getProgramDao() {
		return new ProgramImpDao();
	}

	@Override
	public GroupDao getGroupDao() {
		return new GroupImpDao();
	}
	
	@Override
	public BankDao getBankDao() {
		return new BankImpDao();
	}
	
	@Override
	public VoucherDao getVoucherDao() {
		return new VoucherImpDao();
	}

	@Override
	public AccruedDao getAccruedDao() {
		return new AccruedImpDao();
	}

}
