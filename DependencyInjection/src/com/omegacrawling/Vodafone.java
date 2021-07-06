package com.omegacrawling;

public class Vodafone implements IMessage {
    private int id;
    private String message="It is a test message from vodafone";


    public void send(){
        System.out.printf("Hello There  %s \n",this.message);
    }
}
