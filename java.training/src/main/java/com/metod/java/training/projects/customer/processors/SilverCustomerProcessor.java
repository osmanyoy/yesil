package com.metod.java.training.projects.customer.processors;

import com.metod.java.training.projects.customer.commands.DepositTLCommand;
import com.metod.java.training.projects.customer.commands.ShowTLCommand;
import com.metod.java.training.projects.customer.commands.WithdrawnTLCommand;

public class SilverCustomerProcessor extends AbstractCustomerProcessor {

    public SilverCustomerProcessor() {
        this.commands.add(new ShowTLCommand());
        this.commands.add(new DepositTLCommand());
        this.commands.add(new WithdrawnTLCommand());
    }

}
