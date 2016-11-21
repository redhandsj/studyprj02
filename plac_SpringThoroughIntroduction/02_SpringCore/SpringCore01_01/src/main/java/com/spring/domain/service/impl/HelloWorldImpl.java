package com.spring.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.spring.domain.service.HelloWorld;

public class HelloWorldImpl implements HelloWorld{
 
	@Autowired
	//@Qualifier("SCPasswordEncoder")
	PasswordEncoder passwordEncoder;
	
    public void sayHello(String name) {
        System.out.println("Hello " + name);
        System.out.println("passwordEncoder "+ passwordEncoder.getClass().getName());
        
    }
 
}
