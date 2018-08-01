package ro.alex.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService
{
    public static final String HELLO_WORLD = "Hello world - Original Impl";

    @Override
    public String sayGreeting()
    {
        return HELLO_WORLD;
    }

}
