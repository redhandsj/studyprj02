package org.rhpj.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("org.rhpj.service, org.rhpj.service2, org.rhpj.domain")
@MapperScan("org.rhpj.domain.mapper")
@EnableTransactionManagement
@EnableWebMvc
public class TestConfig /* extends WebMvcConfigurerAdapter */ {
	/**
	 * メッセージリソース設定
	 * @return
	 */
	@Bean
	 public MessageSource messageSource()  {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setUseCodeAsDefaultMessage(true);
        return messageSource;
    }
	/**
	 * テスト用DB
	 * @return
	 */
	@Bean 
	public DataSource dataSource() {
		try {
			EmbeddedDatabase db = new EmbeddedDatabaseBuilder()
					 .setType(EmbeddedDatabaseType.H2)
					 .setScriptEncoding("UTF-8")
					 .addScripts("classpath:sql/schema.sql")
//					 .addScripts("classpath:sql/insert-init-data.sql")
					 .build();
			return db;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//=======================================================================
	// JDBC
	//=======================================================================
	/**
	 * JDBCの設定
	 * @param dataSource
	 * @return
	 */
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
	//=======================================================================
	// mybatis-config.xml
	//=======================================================================
	/**
	 * これによりSqlSessionFactoryBeanを利用し てSqlSessionFactoryが生成される
	 * @return
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		// ここで指定したデータソースからコネクション が取得される 
		sessionFactoryBean.setDataSource(dataSource);
		// MyBatis設定ファイルを指定
		sessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml")); 
		return sessionFactoryBean;
	}

}
