package com.ankitmahala07.decoratorpattern.services;

import com.ankitmahala07.decoratorpattern.interfaces.IMessageService;

public class BasicMessageService implements IMessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending basic message: " + message);
    }
}
