package com.training.dp.common;


public interface ICommand {

    String menuDescription();

    String commandDescription();

    void executeCommand(Customer cust,
                        int amount);
}
