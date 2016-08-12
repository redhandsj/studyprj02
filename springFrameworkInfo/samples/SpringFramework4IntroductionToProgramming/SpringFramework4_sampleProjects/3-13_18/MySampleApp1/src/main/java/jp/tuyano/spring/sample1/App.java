package jp.tuyano.spring.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext app;

	public static void main(String[] args) {
		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBeanInterface bean = (MyBeanInterface)app.getBean("mybean1");
		System.out.println(bean);
	}

}
