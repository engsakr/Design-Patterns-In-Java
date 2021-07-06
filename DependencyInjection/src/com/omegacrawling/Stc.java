package com.omegacrawling;


public class Stc implements IMessage {
    private int id;
    private String message="It is a test message from Stc";


    public void send(){
        System.out.printf("Hello There  %s \n",this.message);
    }
}
