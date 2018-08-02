package ro.alex.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ro.alex.didemo.examplebeans.FakeDataSource;


@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig
{
    @Value("${alex.username}")
    String user;

    @Value("${alex.password}")
    String password;

    @Value("${alex.dburl}")
    String url;

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
    public static PropertySourcesPlaceholderConfigurer properties()
    {
       PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();

       return propertySourcesPlaceholderConfigurer;
    }
}
