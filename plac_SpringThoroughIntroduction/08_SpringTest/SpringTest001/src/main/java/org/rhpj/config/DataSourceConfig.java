package org.rhpj.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//TODO アノテーション駆動のトランザクションを有効にする
//TODO 、Mapperインターフェイスのスキャンを有効にする
//Mapperインターフェイスをスキャンする際に指定する基底パッケージの中には、Mapper以外の インターフェイスが格納されないように
@Configuration
@ComponentScan("org.rhpj.domain")
@EnableTransactionManagement
@MapperScan("org.rhpj.domain.mapper") 
//TODO Spring Data JPAの初期設定（Repositoryクラスが格納されているパッケージ名を指定）
//@EnableJpaRepositories("org.rhpj.domain.repository")
public class DataSourceConfig {

	/**
	 * 組込みDBであるH2を使用
	 * @return
	 */
	@Bean 
	public DataSource dataSource() {
		try {
			EmbeddedDatabase db = new EmbeddedDatabaseBuilder()
					 .setType(EmbeddedDatabaseType.H2)
					 .setScriptEncoding("UTF-8")
					 .addScripts("classpath:sql/schema.sql")
					 .addScripts("classpath:sql/insert-init-data.sql")
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
//	/**
//	 * 明示的トランザクション
//	 * @param transactionManager
//	 * @return
//	 */
//	@Bean
//	 public TransactionTemplate transactionTemplate( PlatformTransactionManager transactionManager) {
//		TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
//		transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
//		transactionTemplate.setTimeout(30);
//		return transactionTemplate;
//	}

	//=======================================================================
	// JPA
	//=======================================================================
//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter() {
//		// Hibernate向けのJPA実装クラス
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		// DB製品の選択
//		vendorAdapter.setDatabase(Database.H2);
//		// 発行SQLをコンソールに出力
//		vendorAdapter.setShowSql(true);
//		return vendorAdapter;
//	}

//	/**
//	 * TODO ■10.5.3  EntityManagerFactoryの定義
//	 * @param dataSource
//	 * @return
//	 */
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
//		// EntityManagerFactory定義
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean(); 
//		// 永続化に使用するデータソースを指定
//		factory.setDataSource(dataSource()); 
//		// EntityManagerで扱う Entityクラスのパッケージ指定
//		factory.setPackagesToScan("org.rhpj.domain.entity");
//		// JpaVendorAdapter指定
//		factory.setJpaVendorAdapter(jpaVendorAdapter());
//		return factory;
//	}

//	/**
//	 * ローカルトランザクションマネージャ
//	 * @return
//	 */
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}
//	/**
//	 * TODO ■10.5.4 JpaTransactionManagerの定義
//	 * @param entityManagerFactory
//	 * @return
//	 */
//	@Bean
//	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//		// @Transactionalアノテーションをメソッドに付加するだけで、JPAのトランザクション管理が可能
//		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
//		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
//		return jpaTransactionManager;
//	}

	//=======================================================================
	// mybatis-config.xml
	//=======================================================================
	/**
	 * これによりSqlSessionFactoryBeanを利用し てSqlSessionFactoryが生成される
	 * @return
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		// ここで指定したデータソースからコネクション が取得される 
		sessionFactoryBean.setDataSource(dataSource());
		// MyBatis設定ファイルを指定
		sessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml")); 
		return sessionFactoryBean;
	}

// PostGre 設定
//	@Bean(destroyMethod = "close") 
//	public DataSource dataSource(
//			 @Value("${database.driverClassName}") String driverClassName,
//			 @Value("${database.url}") String url, 
//			 @Value("${database.username}") String username,
//			 @Value("${database.password}") String password,
//			 @Value("${cp.maxTotal}") int maxTotal,
//			 @Value("${cp.maxIdle}") int maxIdle,
//			 @Value("${cp.minIdle}") int minIdle,
//			 @Value("${cp.maxWaitMillis}") long maxWaitMillis) { 
//		BasicDataSource dataSource = new BasicDataSource(); 
//		dataSource.setDriverClassName(driverClassName);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		dataSource.setDefaultAutoCommit(false);
//		//dataSource.setMaxTotal(maxTotal);
//		dataSource.setMaxIdle(maxIdle);
//		dataSource.setMinIdle(minIdle);
//		//dataSource.setMaxWaitMillis(maxWaitMillis); 
//		return dataSource;
//	}
			
			
			
}
