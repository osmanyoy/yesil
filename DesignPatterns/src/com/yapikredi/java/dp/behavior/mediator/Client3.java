package com.yapikredi.java.dp.behavior.mediator;

public class Client3 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 3 : " + string);
	}

}
