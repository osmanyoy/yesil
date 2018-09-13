package com.yapikredi.java.dp.creational.abstractfactory;

public class CreateComponentFactory {
	public static ICreateComponents createComponents(final ETEmplate emplate) {
		switch (emplate) {
		case BLUE:
			return new CreateBlueCompenents();
		case RED:
			return new CreateRedCompenents();
		case YELLOW:
			return new CreateYellowCompenents();
		default:
			return new CreateBlueCompenents();
		}
	}
}
