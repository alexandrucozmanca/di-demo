package ro.alex.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import ro.alex.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectorControllerTest
{
    private SetterInjectedController setterInjectorController;

    @Before
    public void setUp() throws Exception
    {
        this.setterInjectorController = new SetterInjectedController();
        this.setterInjectorController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting() throws Exception
    {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectorController.sayHello());
    }

}
