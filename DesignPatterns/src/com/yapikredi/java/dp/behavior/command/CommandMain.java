package com.yapikredi.java.dp.behavior.command;

import java.util.List;
import java.util.Scanner;

public class CommandMain {
	public static void main(final String[] args) {
		// Command Pattern
		Scanner scanner = new Scanner(System.in);

		List<ICommand> commands = CommandFactory.getCommands();
		for (int i = 0; i < commands.size(); i++) {
			System.out.println((i + 1) + "-" + commands.get(i)
			                                           .getMenuDesc());

		}
		System.out.println("seçiminiz : ");
		int nextInt = scanner.nextInt();
		ICommand iCommand = commands.get(nextInt);
		iCommand.execute(scanner);

		// Normal without Pattern

		Stock stock = new Stock();
		System.out.println("1-Stock buy");
		System.out.println("2-Stock sell");
		System.out.println("3-Stock view");
		System.out.println("4-Stock exchange");
		System.out.println("seçiminiz : ");
		nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1: {
			System.out.println("Stock name : ");
			String stockName = scanner.nextLine();
			System.out.println("Amount : ");
			int amount = scanner.nextInt();
			stock.buy(stockName,
			          amount);
			break;
		}
		case 2: {
			System.out.println("Stock name : ");
			String stockName = scanner.nextLine();
			System.out.println("Amount : ");
			int amount = scanner.nextInt();
			stock.sell(stockName,
			           amount);
			break;
		}
		case 3: {
			System.out.println("Stock name : ");
			String stockName = scanner.nextLine();
			stock.view(stockName);
			break;
		}
		case 4: {
			System.out.println("Stock name : ");
			String stockName = scanner.nextLine();
			System.out.println("Amount : ");
			int amount = scanner.nextInt();
			stock.sell(stockName,
			           amount);
			break;
		}
		default:
			break;
		}

	}
}
