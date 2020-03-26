package com.example.spring_demo;

import com.example.demo.controller.DemoHelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private DemoHelloController demoHelloController;

    @Test
    void contextLoads() {
        System.out.println(demoHelloController.hello("小琦"));
    }

}
