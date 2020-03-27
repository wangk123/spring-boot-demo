package com.example.ioc;

public class Chinese implements Language {
    @Override
    public String getGreeting() {
        return "你好";
    }

    @Override
    public String getBye() {
        return "再见";
    }
}
