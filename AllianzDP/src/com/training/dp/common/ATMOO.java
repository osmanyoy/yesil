package com.training.dp.common;

import java.util.List;
import java.util.Scanner;

public class ATMOO {

    public static void main(final String[] args) {
        Scanner scannerLoc = new Scanner(System.in);

        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setTlAmount(1000);

        ATMCommandManager managerLoc = ATMCommandFactory.createAtmCommandManager();
        List<ICommand> commandsLoc = managerLoc.getCommands();
        while (true) {
            System.out.println(customerLoc);
            for (int iLoc = 0; iLoc < commandsLoc.size(); iLoc++) {
                ICommand iCommandLoc = commandsLoc.get(iLoc);
                System.out.println((iLoc + 1) + "-" + iCommandLoc.menuDescription());
            }
            System.out.println("Seçiminiz");

            int nextIntLoc = scannerLoc.nextInt();
            ICommand iCommandLoc = commandsLoc.get(nextIntLoc - 1);
            System.out.println(iCommandLoc.commandDescription());

            int amount = scannerLoc.nextInt();

            iCommandLoc.executeCommand(customerLoc,
                                       amount);
        }
    }
}
