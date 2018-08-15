package com.metod.java.training.customer.atm;

public class AtmException extends Exception {
    private static final long serialVersionUID = 3517541570010078912L;

    public AtmException(final String msg) {
        super(msg);
    }
}
