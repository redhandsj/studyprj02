package com.spring.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.spring.domain.service.HelloWorld;

@Component
public class HelloWorldImpl implements HelloWorld {
 
	// TODO PasswordEncoderのBeanがprototypeスコープで定義されていても、親のHelloWorldImplがシングルトンなので
	// シングルトンで扱われる
	@Autowired
	//@Qualifier("SCPasswordEncoder")
	PasswordEncoder passwordEncoder;
	
	@Autowired
	 ApplicationContext context; 
	
    public void sayHello(String name) {
        System.out.println("Hello " + name);
        System.out.println("HelloWorld " + this);
//        System.out.println("passwordEncoder "+ passwordEncoder.getClass().getName());
        System.out.println("passwordEncoder "+ passwordEncoder);

        // TODO getBeanすれば、スコープ通り
//		PasswordEncoder passwordEncoder1 = context.getBean(PasswordEncoder.class);
//		PasswordEncoder passwordEncoder2 = context.getBean(PasswordEncoder.class);
//		System.out.println("passwordEncoder1 "+ passwordEncoder1);
//		System.out.println("passwordEncoder2 "+ passwordEncoder2);

		
		
    }
    
    /**
     * TODO 、DIコンテナは動的にHelloWorldImplクラスのサブクラスを作ってpasswordEncoderメソッドをオーバーライド
     * するので、@Lookupを付けるメソッドにprivateやfinalを付けてはいけませ
     * @return ダミー
     */
    @Lookup
    PasswordEncoder passwordEncoder() {
    	return null; // 戻り値はダミーでよい
    }
 
}
