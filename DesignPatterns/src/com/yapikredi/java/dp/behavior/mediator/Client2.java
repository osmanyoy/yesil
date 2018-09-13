package com.yapikredi.java.dp.behavior.mediator;

public class Client2 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 2 : " + string);
	}

}
