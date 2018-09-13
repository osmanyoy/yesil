package com.yapikredi.java.dp.creational.abstractfactory;

public class CreateBlueCompenents implements ICreateComponents {

	@Override
	public Button createButton() {
		return new BlueButton();
	}

	@Override
	public TextArea createTextArea() {
		return new BlueTextArea();
	}

}
