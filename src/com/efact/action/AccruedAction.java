package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        Voucher vs = gson.fromJson(serializeToJSON(fields), Voucher.class);
        
        AccruedDao accruedDao = dao.getAccruedDao();
    	
        listAccruedConciliation = accruedDao.search(
        		vs.getProgram(),
        		vs.getGroup(),
        		vs.getBank(),
                vs.getVoucher(),
                vs.getStatus(),
                vs.getFrom(),
                vs.getTo()
        );
        
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
	
}
