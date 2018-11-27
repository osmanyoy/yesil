package com.training.dp.common;


public abstract class AbstractCommand implements ICommand {


    private final String menuStr;
    private final String commandStr;

    public AbstractCommand(final String menuStr,
                           final String commandStr) {
        this.menuStr = menuStr;
        this.commandStr = commandStr;
    }

    // public abstract String test();

    @Override
    final public String menuDescription() {
        // this.test();
        return this.menuStr;
    }

    @Override
    public String commandDescription() {
        return this.commandStr;
    }

    @Override
    public void executeCommand(final Customer customerLoc,
                               final int amount) {
        customerLoc.setTlAmount(amount);

    }

}
