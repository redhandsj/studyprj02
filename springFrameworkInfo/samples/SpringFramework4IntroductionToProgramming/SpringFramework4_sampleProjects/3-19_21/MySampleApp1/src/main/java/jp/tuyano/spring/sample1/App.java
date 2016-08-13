package jp.tuyano.spring.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private static ApplicationContext app;
	
	/* list 3-19
	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(MyBean2.class);
		MyBeanInterface bean = app.getBean(MyBeanInterface.class);
		System.out.println(bean);
	} */
	
	// list 3-21
	public static void main(String[] args) {
		app = new AnnotationConfigApplicationContext(AutoMyBeanConfig.class);
		MyBeanInterface bean = app.getBean(MyBeanInterface.class);
		System.out.println(bean);
	}

}
