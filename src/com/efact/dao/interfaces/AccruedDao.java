package com.efact.dao.interfaces;

import java.util.List;
import com.efact.bean.*;

public interface AccruedDao {

	public List<AccruedConciliation> conciliationSearch(AccruedConciliation object) throws Exception;
	
	public List<AccruedIssue> issueSearch(AccruedIssue object) throws Exception;
	
	public AccruedConciliation processAccruedConciliation(String data) throws Exception;
	
	public AccruedIssue processAccruedIssue(AccruedIssue object) throws Exception;
	
	public List<AccruedIssueDropdown> listAccruedIssueDropdown(int programId, int groupId) throws Exception;
	
}
