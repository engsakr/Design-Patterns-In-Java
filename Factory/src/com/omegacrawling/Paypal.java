package com.omegacrawling;

public class Paypal extends PaymentGateway{
    public Paypal() {
        setId(1);
        setName("Paypal");
        setSetupFees(3.75);
    }
}
