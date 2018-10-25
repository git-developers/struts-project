package com.efact.action;

import com.efact.dao.factory.DaoFactory;

import java.lang.reflect.Type;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.efact.bean.*;

public class AccruedAction extends ActionSupportBase implements ServletRequestAware, ServletResponseAware  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private List<AccruedConciliation> listAccruedConciliation;
	private List<AccruedIssue> listAccruedIssue;
	private List<AccruedIssueDropdown> listAccruedIssueDropdown;

	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public AccruedAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
	@Override
	public String execute() throws Exception {
		return Const.SUCCESS;
	}

	public String conciliation() throws Exception {
		return Const.SUCCESS;
	}
	
	public String conciliationSearch() throws Exception {
		
        String fields = request.getParameter("fields");
        AccruedConciliation acc = gson.fromJson(serializeToJSON(fields), AccruedConciliation.class);
        
        AccruedDao accruedDao = dao.getAccruedDao();
    	
        listAccruedConciliation = accruedDao.conciliationSearch(
        		acc.getFrom(),
        		acc.getTo()
        );
        
        return Const.SUCCESS;
	}
	
	public String conciliationProcess() throws Exception {
		
        String fields = request.getParameter("fields");
        Type listType = new TypeToken<List<AccruedConciliation>>(){}.getType();
        List<AccruedConciliation> list = new Gson().fromJson(fields, listType);
        
        AccruedDao accruedDao = dao.getAccruedDao();
        
        int i = 0;
        StringBuilder sb = new StringBuilder();
        
        for (AccruedConciliation accrued : list) {
        	sb.append(accrued.getReaId());
        	
        	if(i++ != list.size() - 1){
        		sb.append("_");
            }
        }
        
        System.out.print("TEXTO_OUT ::: " + sb.toString());
        
        accruedDao.generateAccruedConciliation(sb.toString()); 

        return Const.SUCCESS;
	}
	
	
	
	public String issue() throws Exception {
		return Const.SUCCESS;
	}

	public String issueDropdown() throws Exception {
		
        int programId = Integer.valueOf(request.getParameter("programId"));
        int groupId = Integer.valueOf(request.getParameter("groupId"));
        
        AccruedDao accruedDao = dao.getAccruedDao();
    	
        listAccruedIssueDropdown = accruedDao.listAccruedIssueDropdown(programId, groupId);
        
        for (AccruedIssueDropdown voucher : listAccruedIssueDropdown) {
        	System.out.print("AccruedIssueDropdown ::::: " + voucher.getCieId() + " --- DEADLINE ::: " + voucher.getCieId());
        }
		
		
		return Const.SUCCESS;
	}
	
	public String issueSearch() throws Exception {
		
        String fields = request.getParameter("fields");
        AccruedIssue vs = gson.fromJson(serializeToJSON(fields), AccruedIssue.class);
        
        AccruedDao accruedDao = dao.getAccruedDao();
    	
        listAccruedIssue = accruedDao.issueSearch(
        		vs.getProgram(),
        		vs.getGroup(),
        		vs.getDateTo()
        );
		
		return Const.SUCCESS;
	}
	
	public String issueProcess() throws Exception {
		
        String fields = request.getParameter("fields");
        Type listType = new TypeToken<List<AccruedIssue>>(){}.getType();
        List<AccruedIssue> list = new Gson().fromJson(fields, listType);
        
        AccruedDao accruedDao = dao.getAccruedDao();
        
        
		return Const.SUCCESS;
	}
	
	
	
	@Override
	public void setServletResponse(HttpServletResponse httpServletResponse) {
		this.response = httpServletResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest httpServletRequest) {
		this.request = httpServletRequest;
	}

	public List<AccruedConciliation> getListAccruedConciliation() {
		return listAccruedConciliation;
	}

	public void setListAccruedConciliation(List<AccruedConciliation> listAccruedConciliation) {
		this.listAccruedConciliation = listAccruedConciliation;
	}

	public List<AccruedIssue> getListAccruedIssue() {
		return listAccruedIssue;
	}

	public void setListAccruedIssue(List<AccruedIssue> listAccruedIssue) {
		this.listAccruedIssue = listAccruedIssue;
	}

	public List<AccruedIssueDropdown> getListAccruedIssueDropdown() {
		return listAccruedIssueDropdown;
	}

	public void setListAccruedIssueDropdown(List<AccruedIssueDropdown> listAccruedIssueDropdown) {
		this.listAccruedIssueDropdown = listAccruedIssueDropdown;
	}
	
	
	
	
}
