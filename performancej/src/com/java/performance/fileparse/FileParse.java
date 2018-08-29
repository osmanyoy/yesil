package com.java.performance.fileparse;

public class FileParse {
    public static void main(final String[] args) {
        for (int i = 0; i < 4; i++) {
            Reader reader = new Reader();
            reader.start();
        }
        for (int i = 0; i < 16; i++) {
            Processors processors = new Processors();
            processors.start();
        }
    }
}
