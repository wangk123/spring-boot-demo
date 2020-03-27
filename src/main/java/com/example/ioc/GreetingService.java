package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private Language language;

    public void sayGreeting() {
        String greeting = language.getGreeting();
        System.out.println(greeting);
    }

}
