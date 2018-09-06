package com.yapikredi.training.calc;

public class Calculator {

	public double add(double val1, double val2) {
		return val1 + val2;
	}

	public double subs(double val1, double val2) {
		return val1 - val2;
	}

	public double mult(double val1, double val2) {
		return val1 * val2;
	}

	public double div(double val1, double val2) {
		if (val1 == 0) {
			return 0;
		}
		return val1 / val2;
	}

}
