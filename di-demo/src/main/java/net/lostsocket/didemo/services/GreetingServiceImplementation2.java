package net.lostsocket.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation2 implements GreetingService {

    public static final String HELLO_GURUS = "Hello Cristian!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
