package com.yapikredi.java.dp.creational.abstractfactory;

public class CreateYellowCompenents implements ICreateComponents {

	@Override
	public Button createButton() {
		return new YellowButton();
	}

	@Override
	public TextArea createTextArea() {
		return new YellowTextArea();
	}

}
