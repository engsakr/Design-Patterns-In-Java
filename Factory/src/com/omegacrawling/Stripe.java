package com.omegacrawling;

public class Stripe extends PaymentGateway{
    public Stripe() {
        setId(3);
        setName("Stripe");
        setSetupFees(2.95);
    }
}
