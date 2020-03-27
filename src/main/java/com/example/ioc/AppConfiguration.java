package com.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean(name = "language")
    public Language getLanguage() {
        return new English();
    }

    @Bean(name = "person")
    public Person getPerson() {
        return new Person("小琦", 25, 1);
    }

}
