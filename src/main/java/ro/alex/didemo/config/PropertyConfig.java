package ro.alex.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ro.alex.didemo.examplebeans.FakeDataSource;
import ro.alex.didemo.examplebeans.FakeJmsBroker;


@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig
{
    @Value("${alex.username}")
    String user;

    @Value("${alex.password}")
    String password;

    @Value("${alex.dburl}")
    String url;

    @Value("${alex.jms.username}")
    String jmsUsername;

    @Value("${alex.jms.password}")
    String jmsPassword;

    @Value("${alex.jms.url}")
    String jmsURL;


    @Bean
    public FakeDataSource fakeDataSource()
    {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker()
    {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsURL);

        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties()
    {
       PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

       return propertySourcesPlaceholderConfigurer;
    }
}
