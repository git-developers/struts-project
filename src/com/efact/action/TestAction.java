package com.efact.action;

public class TestAction extends ActionSupportBase {

	private String userName;
    private String password;
	
    public TestAction() {

    }
    
	@Override
	public String execute() throws Exception {
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
