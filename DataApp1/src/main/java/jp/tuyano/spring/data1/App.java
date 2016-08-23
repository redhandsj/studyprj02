package jp.tuyano.spring.data1;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		// bean.xml を取り込み
		context = new ClassPathXmlApplicationContext("classpath:/bean.xml");
		jdbcTemplate = context.getBean(JdbcTemplate.class);

		// execute によるクエリー実行
		jdbcTemplate.execute("insert into mypersondata (name,mail,age) values('tuyano','syoda@tuyano.com',123)");
		
		// DB内容を取得
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from mypersondata");
		for (Map<String, Object> obj : list) {
			System.out.println(obj);
		}
	}
}
