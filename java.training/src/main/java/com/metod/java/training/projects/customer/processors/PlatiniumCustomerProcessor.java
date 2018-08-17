package com.metod.java.training.projects.customer.processors;

import com.metod.java.training.projects.customer.commands.DepositDOLARCommand;
import com.metod.java.training.projects.customer.commands.ShowDOLARCommand;
import com.metod.java.training.projects.customer.commands.WithdrawnDOLARCommand;

public class PlatiniumCustomerProcessor extends GoldCustomerProcessor {

    public PlatiniumCustomerProcessor() {
        this.commands.add(new ShowDOLARCommand());
        this.commands.add(new DepositDOLARCommand());
        this.commands.add(new WithdrawnDOLARCommand());
    }

}
