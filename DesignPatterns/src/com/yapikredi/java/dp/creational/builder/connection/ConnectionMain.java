package com.yapikredi.java.dp.creational.builder.connection;

public class ConnectionMain {
	public static void main(String[] args) {
		ConnectionManager connectionManager = new ConnectionManager();
		try {
			connectionManager.connect(Connection.getBuilder()
			                                    .withDesc("My connection")
			                                    .withIp("127.0.0.1")
			                                    .withPort(1000)
			                                    .build());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
