package com.example.spring_demo;

import com.example.controller.DemoHelloController;
import com.example.ioc.AppConfiguration;
import com.example.ioc.GreetingService;
import com.example.ioc.Language;
import com.example.ioc.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class IocTest {

    @Autowired
    private DemoHelloController demoHelloController;

    @Autowired
    private GreetingService greetingService;
    @Autowired
    private Language language;

    @Test
    void firstInterface() {
        System.out.println(demoHelloController.hello("小琦"));
    }

    @Test
    public void getLanguage() {
        greetingService.sayGreeting();
        System.out.println(language.getBye());
    }

    @Test
    public void getPerson() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());
    }

}
