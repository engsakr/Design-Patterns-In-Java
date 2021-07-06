package com.omegacrawling;

public class Etisalat implements IMessage {
    private int id;
    private String message="It is a test message from Etisalat";


    public void send(){
        System.out.printf("Hello There  %s \n",this.message);
    }
}
