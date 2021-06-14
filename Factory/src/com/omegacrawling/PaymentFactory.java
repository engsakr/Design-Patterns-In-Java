package com.omegacrawling;

/**
 * the class which is responsible for creating the required object on runtime
 */
public class PaymentFactory {
    public static final int PAYPAL = 1;
    public static final int PAYFORT = 2;
    public static final int STRIPE = 3;
    private PaymentFactory(){
    }
    public static PaymentGateway createObject(int indicator){
        switch (indicator){
            case PAYPAL:
                return new Paypal();
            case PAYFORT:
                return new Payfort();
            case STRIPE:
                return new Stripe();
            default: return null;
        }
    }
}
