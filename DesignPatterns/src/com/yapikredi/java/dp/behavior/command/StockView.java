package com.yapikredi.java.dp.behavior.command;

import java.util.Scanner;

public class StockView implements ICommand {

	@Override
	public String getMenuDesc() {
		return "Stock view";
	}

	@Override
	public void execute(final Scanner scanner) {
		System.out.println("Stock name : ");
		String stockName = scanner.nextLine();
		System.out.println("Stock view : " + stockName);
	}

}
