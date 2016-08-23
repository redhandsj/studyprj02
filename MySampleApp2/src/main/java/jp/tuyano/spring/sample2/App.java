package jp.tuyano.spring.sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private static ApplicationContext app;
	// private static Properties mybeanProps;

	public static void main(String[] args) {
		
		app = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		MyBean bean = (MyBean) app.getBean("bean1");
		System.out.println(bean);
		MyBeanKeeper beankeeper = (MyBeanKeeper) app.getBean("beankeeper1");
		System.out.println(beankeeper);

//		app = new ClassPathXmlApplicationContext("classpath:/bean.xml");
//		MyBean bean = (MyBean) app.getBean("bean1");
//		
//		bean.setMessage("Hello, How are you?");
//		// MyBeanKeeperインスタンスを取得する
//		MyBeanKeeper keeper = new MyBeanKeeper(bean, "taro@yamada", "hanako@flower");
//		BeanWrapper wrapper = new BeanWrapperImpl(keeper);
//		PropertyDescriptor[] descriptors = wrapper.getPropertyDescriptors();
//		for (PropertyDescriptor descriptor : descriptors) {
//			String name = descriptor.getName();
//			Object value =  wrapper.getPropertyValue(name);
//			System.out.println(name + ":" + value);
//		}

		
//		app = new FileSystemXmlApplicationContext("file:/C:/00/works/selp2/repos/ews/sts01/MySampleApp2/bean.xml"); // C:\00\works\selp2\repos\ews\sts01\MySampleApp2\bean.xml
//		MyBean bean = (MyBean) app.getBean("bean1");
//		System.out.println(bean);
//
//		// BeanからPropertiesインスタンスを取り出す
//		mybeanProps = (Properties)app.getBean("mybeanprops");
//		String from = mybeanProps.getProperty("keeper.from");
//		String to = mybeanProps.getProperty("keeper.to");
//		MyBeanKeeper keeper = new MyBeanKeeper(bean, from, to);
//		System.out.println(keeper);

//		app = new StaticApplicationContext();
//		Resource res = app.getResource("classpath:sample.txt");
//		if (res.exists()) {
//			try {
//				System.out.println("URI:" + res.getURI());
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			System.out.println("*" + res.getFilename() + "* ==========");
//			InputStream input = null;
//			try {
//				input = res.getInputStream();
//				BufferedInputStream buf_input = new BufferedInputStream(input);
//				byte[] bytes = new byte[10240];
//				buf_input.read(bytes);
//				String xml_str = new String(bytes).trim();
//				System.out.println(xml_str);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			System.out.println("* end * ==========");
//		} else {
//			System.out.println("not found:" + res);
//		}
	} 
}
