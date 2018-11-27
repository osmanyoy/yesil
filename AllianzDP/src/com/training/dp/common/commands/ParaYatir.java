package com.training.dp.common.commands;

import com.training.dp.common.Customer;
import com.training.dp.common.ICommand;

public class ParaYatir implements ICommand {

    @Override
    public String menuDescription() {
        return "Para yatýr";
    }

    @Override
    public String commandDescription() {
        return "Yatýracaðýnýz miktarý giriniz :";
    }

    @Override
    public void executeCommand(final Customer customerLoc,
                               final int amount) {
        customerLoc.setTlAmount(customerLoc.getTlAmount() + amount);

    }

}
