import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	private static ApplicationContext app;

	public static void main(String[] args) {
		//System.out.println("Hello STS World!");
		// DIなし
		//MyBean bean = new MyBean("This is Bean sample!");
		//System.out.println(bean);
		// DIの例
		app = new ClassPathXmlApplicationContext("bean.xml");
		MyBeanInterface bean = (MyBeanInterface)app.getBean("mybean1");
		System.out.println(bean);
	}

}
