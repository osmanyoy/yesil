package com.yapikredi.java.dp.project.customer;

public class LoginException extends Exception {
	private static final long serialVersionUID = -7373035317406974058L;

	private String desc;

	public LoginException(final String desc) {
		super();
		this.setDesc(desc);
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(final String desc) {
		this.desc = desc;
	}

}
