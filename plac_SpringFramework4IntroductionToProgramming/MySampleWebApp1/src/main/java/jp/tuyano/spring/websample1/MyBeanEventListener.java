package jp.tuyano.spring.websample1;

import org.springframework.context.ApplicationListener;

public class MyBeanEventListener implements ApplicationListener<MyBeanEvent> {
	public void onApplicationEvent(MyBeanEvent event) {
		System.out.println("MyBeanEvent is occured!!");
	}

}
