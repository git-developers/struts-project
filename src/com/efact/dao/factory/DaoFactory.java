package com.efact.dao.factory;

import java.util.ResourceBundle;

import com.efact.dao.interfaces.*;

public abstract class DaoFactory {

	public static String dbDriver;
	public static String dbUrl;
	public static String dbUser;
	public static String dbPass;
	
	public static final int MYSQL 	  = 1;
	public static final int SQLSERVER = 2;
	public static final int ORACLE 	  = 3;

	public abstract UserDao getUserDao();
	public abstract ProgramDao getProgramDao();
	public abstract GroupDao getGroupDao();
	public abstract BankDao getBankDao();
	public abstract VoucherDao getVoucherDao();
	public abstract AccruedDao getAccruedDao();
	public abstract SequenceDao getSequenceDao();
	public abstract NoteCreditDao getNoteCreditDao();
	public abstract NoteDebitDao getNoteDebitDao();
	public abstract ReportSalesRecordDao getReportSalesRecordDao();
	public abstract ReportSalesSummaryDao getReportSalesSummaryDao();
	
    public DaoFactory() {
    	
    	ResourceBundle rb = ResourceBundle.getBundle("parameters");
    	
    	dbDriver = rb.getString("db.jdbc.driver");
    	dbUrl = rb.getString("db.url");
    	dbUser = rb.getString("db.user");
    	dbPass = rb.getString("db.pass");
    }

	public static DaoFactory getDAOFactory(int factory){
		
		switch (factory) {
			case MYSQL:
				return new MySqlDaoFactory();
			case SQLSERVER:
				return new SqlServerDaoFactory();
			case ORACLE:
				return new OracleDaoFactory();
			default:
				return null;
		}
	}
}
