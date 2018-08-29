package com.java.performance.fileparse;

public class Processors extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                String line = LineManager.getInstance()
                                         .getLine();
                LineProcessor.getInstance()
                             .processLine(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
