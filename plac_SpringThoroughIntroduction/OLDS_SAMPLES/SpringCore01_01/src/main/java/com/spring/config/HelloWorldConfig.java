package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import com.spring.domain.repository.UserRepository;
import com.spring.domain.service.HelloWorld;
import com.spring.domain.service.impl.HelloWorldImpl;

@Configuration
@ComponentScan("com.spring")
@EnableAspectJAutoProxy
public class HelloWorldConfig {
 
    @Bean
    @Description("This is a sample HelloWorld Bean")
    @Scope("prototype")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
    

    @Bean
    UserRepository userRepository() {
    	//return new UserRepositoryImpl();
    	return null;
    }

    @Bean
// TODO スコープがない場合のデフォルトは、シングルトン
    @Scope("prototype")
    PasswordEncoder SCPasswordEncoder() {
    	return new SCryptPasswordEncoder();
    }

    // TODO 同じものが２つあるとNG
//    @Bean
//    PasswordEncoder BCPasswordEncoder() {
//    	return new BCryptPasswordEncoder();
//    }

//    @Bean
//    UserService userService() {
//    	return new UserServiceImpl(userRepository(), passwordEncoder());
//    }


    
}
 