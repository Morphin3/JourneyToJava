package com.taoism.journeytojava.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Date: 2016-08-18
 * Time: 10:25
 * Author: cf
 * -----------------------------
 */
public class LoggerTest {

    private static final Logger myLogger = Logger.getLogger("com.taoism.journyetojava");

    public static void main(String[] args) {
        myLogger.setLevel(Level.FINEST);
        myLogger.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.FINEST);
        myLogger.addHandler(handler);

        try {
            FileHandler fileHandler = new FileHandler();
            myLogger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        myLogger.entering(LoggerTest.class.getName(), "main", args);

        myLogger.fine("很好");
        myLogger.warning("警告");
//        myLogger.logp(Level.WARNING, LoggerTest.class.getName(), "main", "主函数");

        myLogger.exiting(LoggerTest.class.getName(), "main", null);

        System.err.print("h");
    }

}
