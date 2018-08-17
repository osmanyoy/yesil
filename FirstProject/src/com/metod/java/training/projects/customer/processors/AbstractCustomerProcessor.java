package com.metod.java.training.projects.customer.processors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.metod.java.training.projects.customer.Customer;
import com.metod.java.training.projects.customer.commands.ICommand;

public abstract class AbstractCustomerProcessor implements ICustomerProcessor {
    protected List<ICommand> commands = new ArrayList<>();

    public AbstractCustomerProcessor() {
    }

    @Override
    public void process(final Customer customer, final Scanner scanner) {
        while (true) {
            for (int i = 0; i < this.commands.size(); i++) {
                ICommand iCommand = this.commands.get(i);
                String description = iCommand.getDescription();
                System.out.println((i + 1) + "-" + description);
            }

            int exitIndex = this.commands.size() + 1;
            System.out.println(exitIndex + "-Çýkýþ");

            System.out.println("Seçiminiz : ");

            int nextInt = scanner.nextInt();
            if (nextInt > (exitIndex - 1)) {
                break;
            }
            ICommand iCommand = this.commands.get(nextInt - 1);
            iCommand.execute(scanner, customer);
        }
    }
}
