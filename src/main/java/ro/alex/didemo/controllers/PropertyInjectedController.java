package ro.alex.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import ro.alex.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController
{
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello()
    {
        return greetingServiceImpl.sayGreeting();
    }
}
