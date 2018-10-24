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
	private List<Accrued> listAccruedConciliation;
	
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
        Accrued acc = gson.fromJson(serializeToJSON(fields), Accrued.class);
        
        AccruedDao accruedDao = dao.getAccruedDao();
    	
        listAccruedConciliation = accruedDao.search(
        		acc.getFrom(),
        		acc.getTo()
        );
        
        return Const.SUCCESS;
	}
	
	public String conciliationProcess() throws Exception {
		
        String fields = request.getParameter("fields");
        Type listType = new TypeToken<List<Accrued>>(){}.getType();
        List<Accrued> list = new Gson().fromJson(fields, listType);
        
        AccruedDao accruedDao = dao.getAccruedDao();
        
        int i = 0;
        StringBuilder sb = new StringBuilder();
        
        for (Accrued accrued : list) {
        	sb.append(accrued.getReaId());
        	
        	if(i++ != list.size() - 1){
        		sb.append("_");
            }
        }
        
        System.out.print("TEXTO_OUT ::: " + sb.toString());
        
        accruedDao.generateAccrued(sb.toString()); 

        return Const.SUCCESS;
	}
	
	
	
	
	
	
	public String issue() throws Exception {
		
		return Const.SUCCESS;
	}
	
	
	public String index() throws Exception {
		
		return Const.SUCCESS;
	}
	
	public String filter() throws Exception {
		
		
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

	public List<Accrued> getListAccruedConciliation() {
		return listAccruedConciliation;
	}

	public void setListAccruedConciliation(List<Accrued> listAccruedConciliation) {
		this.listAccruedConciliation = listAccruedConciliation;
	}
	
	
	
}
