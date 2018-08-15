package com.metod.java.training.customer.atm;

public class GumusCustomer implements ICustomer {

    protected int tlAmount;

    @Override
    public void writeMenuToConsole() {
        System.out.println("1-TL çek");
        System.out.println("2-TL yatýr");
    }

    @Override
    public void writeAmountToConsole() {
        System.out.println("TL : " + this.tlAmount);
    }

    @Override
    public void executeMenuCommand(final int menuIndex, final int amount) throws AtmException {
        if (amount < 0) {
            throw new AtmException("Amount negatif olamaz");
        }
        switch (menuIndex) {
        case 1:
            this.tlAmount -= amount;
            break;
        case 2:
            this.tlAmount += amount;
            break;

        default:
            throw new AtmException("yanlýþ menu elemaný");
        }
    }

}
