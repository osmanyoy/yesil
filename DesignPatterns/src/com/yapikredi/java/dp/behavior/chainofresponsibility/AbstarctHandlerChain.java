package com.yapikredi.java.dp.behavior.chainofresponsibility;

public abstract class AbstarctHandlerChain implements IHandler {
	protected AbstarctHandlerChain nextHandler;

	public AbstarctHandlerChain(final AbstarctHandlerChain nextHandler) {
		super();
		this.nextHandler = nextHandler;
	}

	public String callNextHandler(final int value) {
		if (this.nextHandler != null) {
			return this.nextHandler.handler(value);
		}
		return null;
	}

}
