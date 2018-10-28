package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface ReportSalesSummaryDao {

	public List<ReportSalesSummary> salesSummarySearch(int year) throws Exception;
	
	public ReportSalesSummary findOneById(String id) throws Exception;
	
}
