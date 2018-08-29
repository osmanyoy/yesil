package com.java.performance.fileparse;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileManager {
    private static volatile FileManager fileManager = null;

    private FileManager() {
    }

    public static FileManager getInstance() {
        if (FileManager.fileManager == null) {
            synchronized (FileManager.class) {
                if (FileManager.fileManager == null) {
                    FileManager.fileManager = new FileManager();
                }
            }
        }
        return FileManager.fileManager;
    }

    private BlockingQueue<String> filesToRead = new ArrayBlockingQueue<>(1000);

    public String getFileToRead() throws InterruptedException {
        return this.filesToRead.take();
    }

    public void addFile(final String fileName) {
        this.filesToRead.add(fileName);
    }

}
