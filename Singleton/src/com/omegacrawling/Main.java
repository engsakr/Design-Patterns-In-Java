package com.omegacrawling;

import java.util.logging.SocketHandler;

/**
 * @author Ahmed Sakr
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Normal Class");
        for (int i = 0; i <= 3; i++){
            NormalClass normalClass = new NormalClass();
            System.out.println(normalClass.hashCode());
        }

        System.out.println("===================================");


        System.out.println("Eager Logger Class");
        for (int g = 0; g <= 3; g++){
            EagerLogger eagerLogger = EagerLogger.getInstance();
            System.out.println(eagerLogger.hashCode());
        }

        System.out.println("===================================");

        System.out.println("Lazy Logger Class");
        for (int h = 0; h <= 3; h++){
            LazyLogger lazyLogger = LazyLogger.getInstance();
            System.out.println(lazyLogger.hashCode());
        }
    }
}
