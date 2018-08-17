package com.metod.java.training.projects.customer.processors;

import com.metod.java.training.projects.customer.commands.DepositEUROCommand;
import com.metod.java.training.projects.customer.commands.ShowEUROCommand;
import com.metod.java.training.projects.customer.commands.WithdrawnEUROCommand;

public class GoldCustomerProcessor extends SilverCustomerProcessor {

    public GoldCustomerProcessor() {
        this.commands.add(new ShowEUROCommand());
        this.commands.add(new DepositEUROCommand());
        this.commands.add(new WithdrawnEUROCommand());
    }

}
