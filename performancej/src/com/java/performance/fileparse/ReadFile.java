package com.java.performance.fileparse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    private FileInputStream fileInputStream = null;
    private int bufferSize;
    private byte[] buffer;

    public ReadFile(final String fileName, final int bufferSize) {
        // FileChannel fileChannel ;
        // ByteBuffer buffer = ByteBuffer.allocateDirect(bufferSize);
        // fileChannel.read(buffer);

        this.bufferSize = bufferSize;
        this.buffer = new byte[bufferSize];
        File file = new File(fileName);
        try {
            this.fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
        }
    }

    public void readAllLines() {
        try {
            int read = 0;
            do {
                read = this.fileInputStream.read(this.buffer);
                int startOfLine = 0;
                if (read > 0) {
                    for (int i = 0; i < read; i++) {
                        if (this.buffer[i] == '\n') {
                            String line = new String(this.buffer,
                                                     startOfLine,
                                                     i - startOfLine);
                            LineManager.getInstance()
                                       .addLine(line);
                        }
                    }
                }
            } while ((read > 0) && (this.buffer.length < read));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
