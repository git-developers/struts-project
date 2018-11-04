package com.efact.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.efact.dao.interfaces.*;
import com.efact.dao.oracle.*;

public class OracleDaoFactory extends DaoFactory {

	protected static Connection cxn;

	public static Connection getMainConnection(){
		
		try {
			
			Class.forName(dbDriver);	
			cxn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
			System.out.print("OracleDaoFactory ::: Connection Failed!");
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

	@Override
	public SequenceDao getSequenceDao() {
		return new SequenceImpDao();
	}

	@Override
	public ReportSalesRecordDao getReportSalesRecordDao() {
		return new ReportSalesRecordImpDao();
	}

	@Override
	public ReportSalesSummaryDao getReportSalesSummaryDao() {
		return new ReportSalesSummaryImpDao();
	}

	@Override
	public NoteCreditDao getNoteCreditDao() {
		return new NoteCreditImpDao();
	}

	@Override
	public NoteDebitDao getNoteDebitDao() {
		return new NoteDebitImpDao();
	}

}
