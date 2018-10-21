package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.efact.dao.interfaces.*;
import com.efact.dao.oracle.*;

public class OracleDaoFactory extends DaoFactory {

	protected static Connection connection;

	public static Connection getMainConnection(){
		
		try {
			
		    String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
		    String DB_URL = "jdbc:oracle:thin:@10.3.1.34:1521:DBDEV";    
		    String USER = "efact";
		    String PASS = "efact";
			
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

}
