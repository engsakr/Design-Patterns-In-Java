package com.omegacrawling;

/**
 * @author Ahmed Sakr
 */
public class EagerLogger {

    private static EagerLogger eagerLogger = new EagerLogger();

    private EagerLogger(){

    }

    public static EagerLogger getInstance(){
        return eagerLogger;
    }
}
