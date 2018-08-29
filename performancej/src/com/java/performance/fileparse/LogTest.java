package com.java.performance.fileparse;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogTest {
    private static Logger logger = LogManager.getLogManager()
                                             .getLogger("test");

    public static void main(final String[] args) {
        int iVal = 1909;
        if (LogTest.logger.isLoggable(Level.FINER)) {
            LogTest.logger.log(Level.FINER, "tettsgs" + iVal + "dkfdkjf", null);
        }

    }
}
