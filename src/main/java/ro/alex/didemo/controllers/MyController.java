package ro.alex.didemo.controllers;

import org.springframework.stereotype.Controller;
import ro.alex.didemo.services.GreetingService;

@Controller
public class MyController
{
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){

        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }
}
