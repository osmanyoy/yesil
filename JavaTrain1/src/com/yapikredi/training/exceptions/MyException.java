package com.yapikredi.training.exceptions;

public class MyException extends Exception {

	private String bilgi;
	private String digerBilgi;
	private String ensonBilgi;
	
	
	
	public MyException(String bilgi, String digerBilgi, String ensonBilgi) {
		super();
		this.bilgi = bilgi;
		this.digerBilgi = digerBilgi;
		this.ensonBilgi = ensonBilgi;
	}
	
	public String getBilgi() {
		return bilgi;
	}
	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}
	public String getDigerBilgi() {
		return digerBilgi;
	}
	public void setDigerBilgi(String digerBilgi) {
		this.digerBilgi = digerBilgi;
	}
	public String getEnsonBilgi() {
		return ensonBilgi;
	}
	public void setEnsonBilgi(String ensonBilgi) {
		this.ensonBilgi = ensonBilgi;
	}
	
	
}
