package com.java.performance.fileparse;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LineManager {
    private static volatile LineManager instance = null;

    private LineManager() {
    }

    public static LineManager getInstance() {
        if (LineManager.instance == null) {
            synchronized (LineManager.class) {
                if (LineManager.instance == null) {
                    LineManager.instance = new LineManager();
                }
            }
        }
        return LineManager.instance;
    }

    private BlockingQueue<String> linesToProcess = new ArrayBlockingQueue<>(100_000);

    public void addLine(final String line) {
        this.linesToProcess.add(line);
    }

    public String getLine() throws InterruptedException {
        return this.linesToProcess.take();
    }

}
