package com.omegacrawling;

public class Payfort extends PaymentGateway{
    public Payfort() {
        setId(2);
        setName("Payfort");
        setSetupFees(3.90);
    }
}
