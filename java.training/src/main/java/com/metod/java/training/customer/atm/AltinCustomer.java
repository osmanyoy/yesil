package com.metod.java.training.customer.atm;

public class AltinCustomer extends GumusCustomer {
    protected int dolarAmount;

    @Override
    public void writeMenuToConsole() {
        super.writeMenuToConsole();
        System.out.println("3-DOLAR çek");
        System.out.println("4-DOLAR yatýr");
    }

    @Override
    public void writeAmountToConsole() {
        super.writeAmountToConsole();
        System.out.println("DOLAR : " + this.dolarAmount);
    }

    @Override
    public void executeMenuCommand(final int menuIndex, final int amount) throws AtmException {
        if (amount < 0) {
            throw new AtmException("Amount negatif olamaz");
        }
        switch (menuIndex) {
        case 3:
            this.dolarAmount -= amount;
            break;
        case 4:
            this.dolarAmount += amount;
            break;

        default:
            super.executeMenuCommand(menuIndex, amount);
        }
    }

}
