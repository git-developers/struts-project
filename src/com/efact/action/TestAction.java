package com.efact.action;

import org.apache.commons.lang3.StringUtils;

public class TestAction extends ActionSupportBase {

	private String userName;
    private String password;
	
    public TestAction() {

    }
    
	@Override
	public String execute() throws Exception {
		
		double xxx = 23.40;
		
		String xx = StringUtils.rightPad("23.40", 8, '0');
		
		System.out.print("xx ::: " + xx);
		
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
