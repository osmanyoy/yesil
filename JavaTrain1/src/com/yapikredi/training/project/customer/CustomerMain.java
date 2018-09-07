package com.yapikredi.training.project.customer;

import java.util.List;
import java.util.Scanner;

import com.yapikredi.training.java.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username : ");
		String username = scanner.nextLine();
		System.out.println("Password : ");
		String password = scanner.nextLine();
		Customer loggedCustomer = customerManager.login(username, password);
		if (loggedCustomer == null) {
			System.out.println("Username yada Password yanlýþ.");
		} else {
			switch (loggedCustomer.getCustomerType()) {
			case ALTIN:
				System.out.println("ALTIN Müþterimiz hoþ geldiniz. Reklam Altýn");
				break;
			case GUMUS:
				System.out.println("GUMUS Müþterimiz hoþ geldiniz");
				break;
			case PLATINIUM:
				System.out.println("PLATINYUM Müþterimiz hoþ geldiniz.Reklam Paltinyum");
				break;
			default:
				break;
			}
			System.out.println(loggedCustomer);
		}
		List<ICommand> allCommand = loggedCustomer.getAllCommand();
		while (true) {
			for (int i = 0; i < allCommand.size(); i++) {
				System.out.println((i + 1) + "-" + allCommand.get(i).getMenuDesc());
			}
			System.out.println((allCommand.size() + 1) + "-Exit" );
			System.out.println("Seçiminiz : ");
			int nextInt = scanner.nextInt();
			if (nextInt >= allCommand.size() + 1 || nextInt < 1) {
				break;
			}
			ICommand iCommand = allCommand.get(nextInt - 1);
			iCommand.execute(scanner, loggedCustomer);
		}
	}
}
