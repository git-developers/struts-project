package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface ReportSalesSummaryDao {

	public List<ReportSalesSummary> salesSummarySearch(ReportSalesSummary object) throws Exception;
	
	public ReportSalesSummary findOneById(String id) throws Exception;
	
}
