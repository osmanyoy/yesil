package com.yapikredi.java.dp.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandFactory {
	public static List<ICommand> getCommands() {
		List<ICommand> commands = new ArrayList<>();
		commands.add(new StockBuy());
		commands.add(new StockSell());
		commands.add(new StockView());
		return commands;
	}
}
