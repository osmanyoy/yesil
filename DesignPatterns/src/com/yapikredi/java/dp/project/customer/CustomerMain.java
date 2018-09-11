package com.yapikredi.java.dp.project.customer;

import java.util.List;
import java.util.Scanner;

import com.yapikredi.java.dp.project.customer.commands.ICommand;
import com.yapikredi.java.dp.project.customer.commands.processor.CustomerProcessor;
import com.yapikredi.java.dp.project.customer.commands.processor.CustomerProcessorFactory;

public class CustomerMain {
	public static void main(final String[] args) {
		System.getProperties()
		      .put("com.project.dao.type",
		           "man");

		Scanner scanner = new Scanner(System.in);
		System.out.println("username : ");
		String username = scanner.nextLine();
		System.out.println("password : ");
		String password = scanner.nextLine();

		try {
			Customer loginCustomer = CustomerManager.getInstance()
			                                        .login(username,
			                                               password);
			CustomerProcessor createCustomerProcessor = CustomerProcessorFactory.createCustomerProcessor(loginCustomer);
			List<ICommand> commands = createCustomerProcessor.getCommands();

			while (true) {

				for (int i = 0; i < commands.size(); i++) {
					System.out.println((i + 1) + "-" + commands.get(i)
					                                           .getMenuDesc());
				}
				System.out.println((commands.size() + 1) + "-Exit");
				System.out.println("seçiminiz : ");
				int nextInt = scanner.nextInt();
				if (nextInt > commands.size()) {
					System.exit(0);
				}
				ICommand iCommand = commands.get(nextInt - 1);
				iCommand.execute(scanner,
				                 loginCustomer);
			}
		} catch (LoginException e) {
			e.printStackTrace();
		}

	}
}
