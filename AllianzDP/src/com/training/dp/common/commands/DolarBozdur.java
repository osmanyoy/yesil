package com.training.dp.common.commands;

import com.training.dp.common.AbstractCommand;
import com.training.dp.common.Customer;

public class DolarBozdur extends AbstractCommand {

    public DolarBozdur() {
        super("Dolar bozdur",
              "Bozduracaðýnýz Dolar miktarý :");
    }


    @Override
    public void executeCommand(final Customer customerLoc,
                               final int amount) {
        super.executeCommand(customerLoc,
                             amount);
        customerLoc.setTlAmount(customerLoc.getTlAmount() + (amount * 5));

    }


}
