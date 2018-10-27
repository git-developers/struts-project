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

		return SUCCESS;
	}
	
	public String salesRecord() throws Exception {
		return SUCCESS;
	}
	
	public String salesRecordExport() throws Exception {
		
		List<Program> list =  new ArrayList<>();
		
		Program a = new Program();
		a.setId(11);
		a.setName("xxxxxx");
		list.add(a);
		
		Program b = new Program();
		b.setId(22);
		b.setName("uuuuuuu");
		list.add(b);
		
		Program c = new Program();
		c.setId(33);
		c.setName("kkkkkk");
		list.add(c);
		
		System.out.print("EXCEL EXPORT -- 11111111");
		
		ExcelExport xxxxx = new ExcelExport();
		
		this.excelStream = xxxxx.salesRecord(list);
		
		return SUCCESS;
	}

	public InputStream getExcelStream() {
		return excelStream;
	}

	public void setExcelStream(InputStream excelStream) {
		this.excelStream = excelStream;
	}
	
}
