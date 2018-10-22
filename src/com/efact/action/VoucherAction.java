package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.util.Util;
import com.efact.bean.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

//https://www.journaldev.com/2203/get-servlet-session-request-response-context-attributes-struts-2-action

public class VoucherAction extends ActionSupportBase implements ServletRequestAware, ServletResponseAware  {

	private static final long serialVersionUID = 1L;
	private DaoFactory dao;
	private Gson gson;
	private List<Program> listProgram;
	private List<Group> listGroup;
	private List<Bank> listBank;
	private List<Voucher> listVoucher;
	
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public VoucherAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		
		return Const.SUCCESS;
	}

	public String index() throws Exception {
		
		ProgramDao productDao = dao.getProgramDao();
		GroupDao groupDao = dao.getGroupDao();
		BankDao bankDao = dao.getBankDao();
		
		listProgram = productDao.findAll();
		listGroup = groupDao.findAll();
		listBank = bankDao.findAll();
		
		return Const.SUCCESS;
	}
	
	public String search() throws Exception {
		
        String fields = request.getParameter("fields");
        VoucherSearch vs = gson.fromJson(serializeToJSON(fields), VoucherSearch.class);
        
        VoucherDao voucherDao = dao.getVoucherDao();
    	
        listVoucher = voucherDao.search(
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
	
	public String process() throws Exception {
		
        String fields = request.getParameter("fields");
        Type listType = new TypeToken<List<Voucher>>(){}.getType();
        List<Voucher> list = new Gson().fromJson(fields, listType);
        
        VoucherDao voucherDao = dao.getVoucherDao();
        int sequence = voucherDao.getSequence();
        
        for (Voucher voucher : list) {
            voucherDao.insertVoucher(voucher, sequence); 
        }
        
        voucherDao.generateVoucher(sequence);
        
		return Const.SUCCESS;
	}

	public List<Program> getListProgram() {
		return listProgram;
	}

	public void setListProgram(List<Program> listProgram) {
		this.listProgram = listProgram;
	}

	public List<Group> getListGroup() {
		return listGroup;
	}

	public void setListGroup(List<Group> listGroup) {
		this.listGroup = listGroup;
	}

	public List<Bank> getListBank() {
		return listBank;
	}

	public void setListBank(List<Bank> listBank) {
		this.listBank = listBank;
	}

	public List<Voucher> getListVoucher() {
		return listVoucher;
	}

	public void setListVoucher(List<Voucher> listVoucher) {
		this.listVoucher = listVoucher;
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
