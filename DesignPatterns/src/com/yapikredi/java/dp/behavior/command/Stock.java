package com.yapikredi.java.dp.behavior.command;

public class Stock {

	public void buy(final String stockName, final int amount) {
		System.out.println("Stock buy : " + stockName + " amount : " + amount);
	}

	public void sell(final String stockName, final int amount) {
		System.out.println("Stock sell : " + stockName + " amount : " + amount);
	}

	public void view(final String stockName) {
		System.out.println("Stock view : " + stockName);

	}

	public void exchange(final String stockName1, final String stockName2, final int amount) {
		System.out.println("Exchange");
	}
}
