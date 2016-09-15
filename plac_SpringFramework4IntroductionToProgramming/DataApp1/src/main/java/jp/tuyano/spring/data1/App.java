package jp.tuyano.spring.data1;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;


public class App {

//	private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext context;
	private static EntityManager manager;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		LocalContainerEntityManagerFactoryBean factory =
				context.getBean(LocalContainerEntityManagerFactoryBean.class);
		manager = factory.getNativeEntityManagerFactory().createEntityManager();
		
		MyPersonDataDao<MyPersonData> dao = new MyPersonDataDaoImpl<MyPersonData>(manager);
		
		// insert
//		MyPersonData personData = new MyPersonData("tuyano","syoda@tuyano.com",123);
//		dao.addEntity(personData);

//		// Update
//		// 取り出し
//		MyPersonData personData = manager.find(MyPersonData.class, 1L);
//		// 編集
//		personData.setName("*** " + personData.getName() + " ***");
//		// 登録
//		dao.updateEntity(personData);

		// 削除
		dao.removeEntity(1L);
		
		// 全検索
		List<MyPersonData> listAll = dao.getAllEntity();
		for(MyPersonData person : listAll) {
			System.out.println("listAll ： " + person);
		}
		
		// 値指定検索
		List<MyPersonData> lists = dao.findByField("name", "hanako");
		for(MyPersonData person : lists) {
			System.out.println("lists ： " + person);
		}

		
//		context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
//		LocalContainerEntityManagerFactoryBean factory =
//				context.getBean(LocalContainerEntityManagerFactoryBean.class);
//		manager = factory.getNativeEntityManagerFactory().createEntityManager();
//		
//		MyPersonData data = manager.find(MyPersonData.class, 1L);
//		System.out.println(data);

		
//		// bean.xml を取り込み
//		context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
//		jdbcTemplate = context.getBean(JdbcTemplate.class);
//
//		// execute によるクエリー実行
//		jdbcTemplate.execute("insert into mypersondata (name,mail,age) values('tuyano','syoda@tuyano.com',123)");
//		
//		// DB内容を取得
//		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from mypersondata");
//		for (Map<String, Object> obj : list) {
//			System.out.println(obj);
//		}
	}
}
