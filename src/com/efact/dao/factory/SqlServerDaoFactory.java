package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.efact.dao.interfaces.*;

public class SqlServerDaoFactory extends DaoFactory {

	protected static Connection connection;
	
	public static Connection getMainConnection(){
		
		try {
			
			Class.forName(dbDriver);	
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			
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

	@Override
	public SequenceDao getSequenceDao() {
		return null;
	}

	@Override
	public ReportSalesRecordDao getReportSalesRecordDao() {
		return null;
	}
	
}
