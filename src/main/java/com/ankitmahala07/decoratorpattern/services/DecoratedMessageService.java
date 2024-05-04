package com.ankitmahala07.decoratorpattern.services;

import com.ankitmahala07.decoratorpattern.interfaces.IMessageService;

public class DecoratedMessageService implements IMessageService {

    private final IMessageService messageService;

    public DecoratedMessageService(IMessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Decorating message...");
        messageService.sendMessage(message);
        System.out.println("Decoration complete.");
    }
}
