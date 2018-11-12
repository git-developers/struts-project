package com.efact.action;

import com.efact.util.Util;

public class TestAction extends ActionSupportBase {

	private String userName;
    private String password;
	
    public TestAction() {

    }
    
	@Override
	public String execute() throws Exception {
		
		double xxx = 12345.40;
		
		String xx = Util.amountFormat(xxx, 2);
		
		System.out.print("xxxxx ::: " + xx);
		
		return SUCCESS;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
