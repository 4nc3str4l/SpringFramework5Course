package net.lostsocket.didemo.controllers;

import net.lostsocket.didemo.services.GreetingServiceImplementation2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImplementation2 greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
