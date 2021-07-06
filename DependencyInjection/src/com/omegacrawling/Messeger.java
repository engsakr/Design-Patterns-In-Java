package com.omegacrawling;

public class Messeger {

    private IMessage _mailService;

    public Messeger() {
    }

    /**
     * Using Constructor Injection Way
     * @param mailService
     */
    public Messeger(IMessage mailService){
        _mailService = mailService;
    }
    public void sendMessage(){
        _mailService.send();
    }

    /**
     * using method injection
     * @param mailService
     */
    public void sendMessageMethodInjection(IMessage mailService){
        mailService.send();
    }


    /**
     * using property injection
     */
    public IMessage messageType;

    public IMessage getMessageType() {
        return messageType;
    }

    public void setMessageType(IMessage messageType) {
        this.messageType = messageType;
    }

    //Method Injection Way
    public void sendMessagePropertyInjection(){
        messageType.send();
    }
}
