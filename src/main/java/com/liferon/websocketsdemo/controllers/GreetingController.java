package com.liferon.websocketsdemo.controllers;

import com.liferon.websocketsdemo.messages.Greeting;
import com.liferon.websocketsdemo.messages.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) {
        System.out.println(message);
        return new Greeting("Hello, "+HtmlUtils.htmlEscape(message.getName())+"!");
    }
}
