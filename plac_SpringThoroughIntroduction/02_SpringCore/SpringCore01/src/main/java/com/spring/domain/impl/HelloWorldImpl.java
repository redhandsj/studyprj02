package com.spring.domain.impl;

import com.spring.domain.HelloWorld;

public class HelloWorldImpl implements HelloWorld{
 
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
 
}
