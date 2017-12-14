package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.spring.config.HelloWorldConfig;
import com.spring.domain.service.HelloWorld;

public class AppMain {
	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld bean1 = (HelloWorld) context.getBean("helloWorld");
		bean1.sayHello("----1----- Spring 4");
		HelloWorld bean2 = (HelloWorld) context.getBean("helloWorld");
		bean2.sayHello("----2----- Spring 4");
		
		// シングルトンテスト
//		PasswordEncoder passwordEncoder1 = context.getBean(PasswordEncoder.class);
//		PasswordEncoder passwordEncoder2 = context.getBean(PasswordEncoder.class);
//		System.out.println("passwordEncoder1 "+ passwordEncoder1);
//		System.out.println("passwordEncoder2 "+ passwordEncoder2);
		
		context.close();
	
	}
}
