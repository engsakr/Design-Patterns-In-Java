package com.omegacrawling;

public abstract class PaymentGateway {
    private int id;
    private String name;
    private double setupFees;

    public PaymentGateway() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSetupFees() {
        return setupFees;
    }

    public void setSetupFees(double setupFees) {
        this.setupFees = setupFees;
    }

    public void onSuccessTransactionMessage(){
        System.out.printf("Your Transaction Done Successfully Using %s \n",getName());
    }
}
