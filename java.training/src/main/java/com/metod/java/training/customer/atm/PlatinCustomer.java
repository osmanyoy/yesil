package com.metod.java.training.customer.atm;

public class PlatinCustomer extends AltinCustomer {
    protected int borsaAmount;

    @Override
    public void writeMenuToConsole() {
        super.writeMenuToConsole();
        System.out.println("5-BORSA çek");
        System.out.println("6-BORSA yatýr");
    }

    @Override
    public void writeAmountToConsole() {
        super.writeAmountToConsole();
        System.out.println("BORSA : " + this.borsaAmount);
    }

    @Override
    public void executeMenuCommand(final int menuIndex, final int amount) throws AtmException {
        if (amount < 0) {
            throw new AtmException("Amount negatif olamaz");
        }
        switch (menuIndex) {
        case 5:
            this.borsaAmount -= amount;
            break;
        case 6:
            this.borsaAmount += amount;
            break;

        default:
            super.executeMenuCommand(menuIndex, amount);
        }
    }
}
