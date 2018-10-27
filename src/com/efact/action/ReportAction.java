package com.efact.action;

import com.efact.dao.factory.DaoFactory;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.util.Dates;
import com.efact.util.ExcelExport;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.efact.bean.*;
import java.io.InputStream;

public class ReportAction extends ActionSupportBase implements ServletRequestAware, ServletResponseAware  {
	
	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private InputStream excelStream;
	private List<Sequence> listSequence;
	private List<ReportSalesRecord> listReportSalesRecord;
	
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public ReportAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}
	
	public String salesRecord() throws Exception {
		
		SequenceDao sequenceDao = dao.getSequenceDao();
		listSequence = sequenceDao.findAll();
		
		return SUCCESS;
	}
	
	public String salesRecordSearch() throws Exception {
		
        String fields = request.getParameter("fields");
        ReportSalesRecord rs = gson.fromJson(serializeToJSON(fields), ReportSalesRecord.class);
        ReportSalesRecordDao rsDao = dao.getReportSalesRecordDao();
    	
        listReportSalesRecord = rsDao.salesRecordSearch(
                rs.getQuerySequence(),
                rs.getQueryFrom(),
                rs.getQueryTo()
        );
        
        return SUCCESS;
	}
	
	public String salesRecordExport() throws Exception {
		
        String fields = request.getParameter("fields");
        ReportSalesRecord rs = gson.fromJson(serializeToJSON(fields), ReportSalesRecord.class);
        
        ReportSalesRecordDao rsDao = dao.getReportSalesRecordDao();
    	
        listReportSalesRecord = rsDao.salesRecordSearch(
                rs.getQuerySequence(),
                rs.getQueryFrom(),
                rs.getQueryTo()
        );
        
		this.excelStream = ExcelExport.salesRecordExport(listReportSalesRecord);
		
		return SUCCESS;
	}
	
	
	
	
	public String salesSummary() throws Exception {
		return SUCCESS;
	}
	
	public String salesSummarySearch() throws Exception {
		return SUCCESS;
	}
	
	public String salesSummaryExport() throws Exception {
		return SUCCESS;
	}
	
	
	

	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}
	
	
	@Override
	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}
}
