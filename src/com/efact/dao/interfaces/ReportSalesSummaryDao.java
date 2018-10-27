package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface ReportSalesSummaryDao {

	public List<ReportSalesSummary> salesRecordSearch(int year) throws Exception;
	
	public ReportSalesSummary findOneById(String id) throws Exception;
	
}
