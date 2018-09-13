package com.yapikredi.java.dp.behavior.command;

import java.util.Scanner;

public class StockSell implements ICommand {

	@Override
	public String getMenuDesc() {
		return "Stock sell";
	}

	@Override
	public void execute(final Scanner scanner) {
		System.out.println("Stock name : ");
		String stockName = scanner.nextLine();
		System.out.println("Amount : ");
		int amount = scanner.nextInt();
		System.out.println("Stock sell : " + stockName + " amount : " + amount);
	}

}
