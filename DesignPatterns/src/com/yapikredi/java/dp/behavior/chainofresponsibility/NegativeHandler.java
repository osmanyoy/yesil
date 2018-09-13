package com.yapikredi.java.dp.behavior.chainofresponsibility;

public class NegativeHandler extends AbstarctHandlerChain {

	public NegativeHandler(final AbstarctHandlerChain nextHandler) {
		super(nextHandler);
	}

	@Override
	public String handler(final int value) {
		if (value < 0) {
			return "Negatif";
		}
		return this.callNextHandler(value);
	}

}
