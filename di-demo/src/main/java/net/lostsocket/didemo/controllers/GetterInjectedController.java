package net.lostsocket.didemo.controllers;

import net.lostsocket.didemo.services.GreetingService;
import net.lostsocket.didemo.services.GreetingServiceImplementation2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
