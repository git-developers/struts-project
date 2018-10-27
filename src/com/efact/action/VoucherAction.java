package com.efact.action;

import com.efact.dao.factory.DaoFactory;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
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
	private List<Voucher> listVoucherResult;
	
	private HttpServletRequest request = null;
	private HttpServletResponse response = null;
	
    public VoucherAction() {
		dao = DaoFactory.getDAOFactory(DaoFactory.ORACLE);
		gson = new GsonBuilder().setPrettyPrinting().create();
    }
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}

	public String index() throws Exception {
		
		ProgramDao productDao = dao.getProgramDao();
		GroupDao groupDao = dao.getGroupDao();
		BankDao bankDao = dao.getBankDao();
		
		listProgram = productDao.findAll();
		listGroup = groupDao.findAll();
		listBank = bankDao.findAll();
		
		return SUCCESS;
	}
	
	public String search() throws Exception {
		
        String fields = request.getParameter("fields");
        Voucher vs = gson.fromJson(serializeToJSON(fields), Voucher.class);
        
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
        
        return SUCCESS;
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
        
        listVoucherResult = voucherDao.generateVoucher(sequence);
        
		return SUCCESS;
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

	public List<Voucher> getListVoucherResult() {
		return listVoucherResult;
	}

	public void setListVoucherResult(List<Voucher> listVoucherResult) {
		this.listVoucherResult = listVoucherResult;
	}

	
}
