package ro.alex.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.alex.didemo.controllers.ConstructorInjectedController;
import ro.alex.didemo.controllers.MyController;
import ro.alex.didemo.controllers.PropertyInjectedController;
import ro.alex.didemo.controllers.SetterInjectedController;
import ro.alex.didemo.examplebeans.FakeDataSource;
import ro.alex.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args)
    {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getPassword());

    }
}
