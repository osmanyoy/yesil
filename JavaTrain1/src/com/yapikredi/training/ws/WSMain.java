package com.yapikredi.training.ws;

import javax.xml.ws.Endpoint;

public class WSMain {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1/person", new PersonWS());
	}
}
