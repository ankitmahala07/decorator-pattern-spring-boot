package com.ankitmahala07.decoratorpattern.controller;
import com.ankitmahala07.decoratorpattern.interfaces.IMessageService;
import com.ankitmahala07.decoratorpattern.services.BasicMessageService;
import com.ankitmahala07.decoratorpattern.services.DecoratedMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @PutMapping("/basic")
    public ResponseEntity<String> invokeBasicMessageService(@RequestBody String message){
        IMessageService messageService = new BasicMessageService();
        messageService.sendMessage(message);
        return ResponseEntity.ok("Successfully invoked basic message service");
    }

    @PutMapping("/decorated")
    public ResponseEntity<String> invokeDecoratedMessageService(@RequestBody String message){
        // Create object of Decorating service and pass the object of service that needs to be decorated,
        // In our case BasicMessageService
        IMessageService messageService = new DecoratedMessageService(new BasicMessageService());
        messageService.sendMessage(message);
        return ResponseEntity.ok("Successfully invoked decorated message service");
    }

}
