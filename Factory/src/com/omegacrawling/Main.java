package com.omegacrawling;


public class Main {

    public static void main(String[] args) {
	// write your code here
        PaymentGateway paypal = PaymentFactory.createObject(PaymentFactory.PAYPAL);
        paypal.onSuccessTransactionMessage();

        PaymentGateway payfort = PaymentFactory.createObject(PaymentFactory.PAYFORT);
        payfort.onSuccessTransactionMessage();

        PaymentGateway stripe = PaymentFactory.createObject(PaymentFactory.STRIPE);
        stripe.onSuccessTransactionMessage();
    }
}
/**
 * creational design pattern
 *
 * alows us to create object without mentioning its class directly
 * => class executes in runtime using a predefined parameters to refer it
 * the client (application) instead handling with the key (class) of an object , it communicate with the factory
 * we use it when we have multi-options do the same task.
 */