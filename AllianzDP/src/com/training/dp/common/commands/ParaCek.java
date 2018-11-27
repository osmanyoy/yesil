package com.training.dp.common.commands;

import com.training.dp.common.AbstractCommand;
import com.training.dp.common.Customer;

public class ParaCek extends AbstractCommand {

    public ParaCek() {
        super("Para çek",
              "Çekeceðiniz miktarý giriniz :");
    }

    @Override
    public void executeCommand(final Customer customerLoc,
                               final int amount) {
        customerLoc.setTlAmount(customerLoc.getTlAmount() - amount);

    }

}
