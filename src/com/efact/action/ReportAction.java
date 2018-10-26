package com.efact.action;

import com.efact.dao.factory.DaoFactory;

import java.util.ArrayList;
import java.util.List;

import com.efact.dao.interfaces.*;
import com.efact.util.Const;
import com.efact.util.ExcelExport;
import com.efact.bean.*;
import java.io.InputStream;

public class ReportAction extends ActionSupportBase  {

	private InputStream excelStream;
	
	@Override
	public String execute() throws Exception {

		return Const.SUCCESS;
	}
	
	public String salesRecord() throws Exception {
		
		List<Program> list =  new ArrayList<>();
		
		Program a = new Program();
		a.setId(11);
		a.setName("xxxxxx");
		list.add(a);
		
		Program b = new Program();
		b.setId(22);
		b.setName("uuuuuuu");
		list.add(b);
		
		this.excelStream = ExcelExport.salesRecord(list);
		
		return Const.SUCCESS;
	}

	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}
	
	
	
}
