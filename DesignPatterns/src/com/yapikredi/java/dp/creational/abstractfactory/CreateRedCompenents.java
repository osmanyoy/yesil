package com.yapikredi.java.dp.creational.abstractfactory;

public class CreateRedCompenents implements ICreateComponents {

	@Override
	public Button createButton() {
		return new RedButton();
	}

	@Override
	public TextArea createTextArea() {
		return new RedTextArea();
	}

}
