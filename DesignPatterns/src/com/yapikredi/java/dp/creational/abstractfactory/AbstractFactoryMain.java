package com.yapikredi.java.dp.creational.abstractfactory;

public class AbstractFactoryMain {
	public static void main(final String[] args) {
		Button button = ButtonFactory.createButton(ETEmplate.RED);
		TextArea textArea = TextAreaFactory.createTextArea(ETEmplate.RED);

		ICreateComponents createComponents = CreateComponentFactory.createComponents(ETEmplate.RED);
		Button createButton = createComponents.createButton();
		TextArea createTextArea = createComponents.createTextArea();
	}
}
