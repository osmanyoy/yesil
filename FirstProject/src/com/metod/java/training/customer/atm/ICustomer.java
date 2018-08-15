package com.metod.java.training.customer.atm;

public interface ICustomer {
    public void writeMenuToConsole();

    public void writeAmountToConsole();

    public void executeMenuCommand(final int menuIndex, final int amount) throws AtmException;

}
