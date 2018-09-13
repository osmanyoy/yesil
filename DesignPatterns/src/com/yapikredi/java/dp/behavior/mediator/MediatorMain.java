package com.yapikredi.java.dp.behavior.mediator;

import java.util.Arrays;

public class MediatorMain {
	public static void main(final String[] args) {
		Mediator mediator = new Mediator();
		Client1 client1 = new Client1();
		Client2 client2 = new Client2();
		Client3 client3 = new Client3();
		Client4 client4 = new Client4();
		Client5 client5 = new Client5();
		Client6 client6 = new Client6();

		mediator.register(client1,
		                  "client1");
		mediator.register(client2,
		                  "client2");
		mediator.register(client3,
		                  "client3");
		mediator.register(client4,
		                  "client4");
		mediator.register(client5,
		                  "client5");
		mediator.register(client6,
		                  "client6");

		mediator.send(client1,
		              Arrays.asList("client5",
		                            "client6"),
		              "hello from Client1");

	}
}
