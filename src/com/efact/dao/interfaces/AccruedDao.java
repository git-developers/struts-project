package com.efact.dao.interfaces;

import java.sql.Date;
import java.util.List;
import com.efact.bean.*;

public interface AccruedDao {

	public List<AccruedConciliation> conciliationSearch(
		    Date from,    
		    Date to
    ) throws Exception;
	

	public List<AccruedIssue> issueSearch(
			int programId, 
			int groupId, 
			int cieId
	) throws Exception;
	
	public AccruedConciliation generateAccruedConciliation(String data) throws Exception;
	
	public List<AccruedIssueDropdown> listAccruedIssueDropdown(int programId, int groupId) throws Exception;
	
}
