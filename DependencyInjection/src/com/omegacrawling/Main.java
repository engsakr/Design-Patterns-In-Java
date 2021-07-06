package com.omegacrawling;

public class Main {

    public static void main(String[] args) {

        //Constructor Injection Way
        Messeger msg = new Messeger(new Vodafone());
        msg.sendMessage();

        //using method injection way
        Messeger msg2 = new Messeger();
        msg2.sendMessageMethodInjection(new Stc());

        //using property injection way
        Messeger msg3 = new Messeger();
        msg3.setMessageType(new Etisalat());
        msg3.sendMessagePropertyInjection();
    }
}
