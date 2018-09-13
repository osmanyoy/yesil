package com.yapikredi.java.dp.creational.abstractfactory;

public class TextAreaFactory {
	public static TextArea createTextArea(final ETEmplate emplate) {
		switch (emplate) {
		case BLUE:
			return new BlueTextArea();
		case RED:
			return new RedTextArea();
		case YELLOW:
			return new YellowTextArea();
		default:
			return new TextArea();
		}
	}
}
