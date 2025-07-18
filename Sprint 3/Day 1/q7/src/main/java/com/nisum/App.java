package com.nisum;

import java.util.logging.Logger;

class GlobalHandler implements Thread.UncaughtExceptionHandler {

    private static final Logger LOGGER =  Logger.getLogger(GlobalHandler.class.getName());

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(GlobalHandler.class.getName());
        LOGGER.info("testing");
    }
}

public class App {
    public static void main(String[] args) {
        // Example usage
        Thread.setDefaultUncaughtExceptionHandler(new GlobalHandler());

        System.out.println(App.class.getName());
        System.out.println(10/0);
    }
}
