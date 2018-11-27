package com.training.dp.common;

import java.util.ArrayList;
import java.util.List;

public class ATMCommandManager {

    private final List<ICommand> commands = new ArrayList<>();

    public void addCommand(final ICommand commandParam) {
        this.commands.add(commandParam);
    }

    public List<ICommand> getCommands() {
        return this.commands;
    }
}
