package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.efact.dao.interfaces.*;

public class SqlServerDaoFactory extends DaoFactory {

	protected static Connection cxn;
	
	public static Connection getMainConnection(){
		
		try {
			
			Class.forName(dbDriver);	
			cxn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
			System.out.print("SqlServerDaoFactory ::: Connection Failed!");
			e.printStackTrace();
		}
		
		return cxn;
	}
	
    public void closeConnection() throws SQLException {
        if(cxn != null){
            if(!cxn.isClosed()){
            	cxn.close();
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

	@Override
	public ReportSalesSummaryDao getReportSalesSummaryDao() {
		return null;
	}

	@Override
	public NoteCreditDao getNoteCreditDao() {
		return null;
	}

	@Override
	public NoteDebitDao getNoteDebitDao() {
		return null;
	}
	
}
