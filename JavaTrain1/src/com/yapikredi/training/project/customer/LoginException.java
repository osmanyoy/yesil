package com.yapikredi.training.project.customer;

public class LoginException extends Exception {
	private String loginDesc;

	public LoginException(String loginDesc) {
		super();
		this.loginDesc = loginDesc;
	}

	public String getLoginDesc() {
		return loginDesc;
	}

	public void setLoginDesc(String loginDesc) {
		this.loginDesc = loginDesc;
	}
	
	
}
