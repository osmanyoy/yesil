package com.training.dp.creation.general;


public class PrinterProxy extends Printer {

    private final Printer printer;

    @Override
    public void print(final Customer customerParam) {
        System.out.println("Print iþlemi baþlýyor");
        this.printer.print(customerParam);
        System.out.println("Print iþlemi bitti");
    }

    public PrinterProxy(final Printer printerParam) {
        this.printer = printerParam;
    }
}
