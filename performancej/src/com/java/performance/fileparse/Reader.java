package com.java.performance.fileparse;

public class Reader extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                String fileToRead = FileManager.getInstance()
                                               .getFileToRead();
                ReadFile file = new ReadFile(fileToRead,
                                             4096 * 1024);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
