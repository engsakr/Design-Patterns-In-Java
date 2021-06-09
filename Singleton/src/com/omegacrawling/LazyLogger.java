package com.omegacrawling;

/**
 * @author Ahmed Sakr
 */
public class LazyLogger {

    private static LazyLogger instance;

    private LazyLogger(){

    }

    public static LazyLogger getInstance(){
        if (instance==null){
            instance = new LazyLogger();
        }
        return instance;
    }
}
