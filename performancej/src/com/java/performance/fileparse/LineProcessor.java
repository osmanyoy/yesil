package com.java.performance.fileparse;

public class LineProcessor {
    private static volatile LineProcessor instance = null;

    private LineProcessor() {
    }

    public static LineProcessor getInstance() {
        if (LineProcessor.instance == null) {
            synchronized (LineProcessor.class) {
                if (LineProcessor.instance == null) {
                    LineProcessor.instance = new LineProcessor();
                }
            }
        }
        return LineProcessor.instance;
    }

    public void processLine(final String line) {
        System.out.println(line);
    }

}
