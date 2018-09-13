package com.yapikredi.java.dp.behavior.command;

import java.util.Scanner;

public class StockBuy implements ICommand {

	@Override
	public String getMenuDesc() {
		return "Stock buy";
	}

	@Override
	public void execute(final Scanner scanner) {
		System.out.println("Stock name : ");
		String stockName = scanner.nextLine();
		System.out.println("Amount : ");
		int amount = scanner.nextInt();
		System.out.println("Stock buy : " + stockName + " amount : " + amount);
	}

}
