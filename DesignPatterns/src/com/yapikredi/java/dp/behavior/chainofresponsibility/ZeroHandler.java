package com.yapikredi.java.dp.behavior.chainofresponsibility;

public class ZeroHandler extends AbstarctHandlerChain {

	public ZeroHandler(final AbstarctHandlerChain nextHandler) {
		super(nextHandler);
	}

	@Override
	public String handler(final int value) {
		if (value == 0) {
			return "Zero";
		}
		return this.callNextHandler(value);
	}

}
