package com.yapikredi.java.dp.creational.abstractfactory;

public class ButtonFactory {
	public static Button createButton(final ETEmplate emplate) {
		switch (emplate) {
		case BLUE:
			return new BlueButton();
		case RED:
			return new RedButton();
		case YELLOW:
			return new YellowButton();
		default:
			return new BlueButton();
		}
	}
}
