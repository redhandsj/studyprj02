package jp.tuyano.spring.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactoryBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@ImportResource("classpath:dataSource.xml") // XMLファイルをインポートする

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("jp.tuyano.spring") // RepositoryインターフェイスやカスタムRepositoryクラスが格納されているパッケージ名を指定
@PropertySource(value = {"classpath:spring/bean.properties"})
public class JpaConfig {

	@Autowired
    private Environment env;


	
//	@Value("classpath:spring/script.sql")
//	private Resource H2_SCHEMA_SCRIPT;

	// 組込用ではないらしい
	// http://qiita.com/kazuki43zoo/items/bc036b433444f5c33dc4
//	/**
//	 * データ構築
//	 * @param dataSource
//	 * @return
//	 */
//	@Bean
//	public DataSourceInitializer dataSourceInitializer(final DataSource dataSource) {
//		final DataSourceInitializer initializer = new DataSourceInitializer();
//		initializer.setDataSource(dataSource);
//		initializer.setDatabasePopulator(databasePopulator());
//		return initializer;
//	}
//	private DatabasePopulator databasePopulator() {
//	    final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//	    populator.addScript(H2_SCHEMA_SCRIPT);
//	    return populator;
//	}

	
//	/**
//	 * データ構築
//	 * @return
//	 */
//	@Bean
//	  public EmbeddedDatabaseFactoryBean datasource(final DataSource dataSource) {
//		EmbeddedDatabaseFactoryBean bean = new EmbeddedDatabaseFactoryBean();
//		bean.setDatabaseType(EmbeddedDatabaseType.H2);
//		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
//		databasePopulator.addScript(new ClassPathResource(env.getProperty("jdbc.scriptLocation")));
//		bean.setDatabasePopulator(databasePopulator);
//		bean.afterPropertiesSet();
//	    return bean;
//	}

	/**
	 * 使用するデータソース
	 */
	@Bean
	public DataSource configureDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		dataSource.setUrl(env.getProperty("jdbc.url"));
		dataSource.setUsername(env.getProperty("jdbc.username"));
		dataSource.setPassword(env.getProperty("jdbc.password"));
		return dataSource;
   }

	/**
	 * データ構築
	 * @return
	 */
	@Bean(destroyMethod = "shutdown")
	public EmbeddedDatabase dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).
				addScript(env.getProperty("jdbc.scriptLocation")).
				build();
	}

	/**
	 * 
	 * @return
	 */
	@Bean
	 public JpaVendorAdapter jpaVendorAdapter() {
		// 、Hibernate向け実装クラスであるHibernateJpaVendorAdapterのBeanを定義
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		// 使用するデータベース製品を設定
		vendorAdapter.setDatabase(Database.H2);
		// Hibernateがデータベースに対して発行するSQ.Lをコンソールに出力する機能を有効化
		vendorAdapter.setShowSql(true);
		vendorAdapter.setGenerateDdl(true);
		return vendorAdapter;
	}
	
	/**
	 * 
	 * @param dataSource
	 * @return
	 */
	@Bean
	 public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		// 、指定されたJPA実装が提供するEntityManagerFactoryがBeanとしてDIコンテナ上で管理されるようにする。
		LocalContainerEntityManagerFactoryBean factory =  new LocalContainerEntityManagerFactoryBean(); 
		// JPAの永続化処理で使用するデータソースを設定
		factory.setDataSource(dataSource);
		//  Entityクラスが定義されているパッケージを指定
		factory.setPackagesToScan("jp.tuyano.spring");
		// JpaVendorAdapterを指定
		factory.setJpaVendorAdapter(this.jpaVendorAdapter());
		return factory;
	}

	/**
	 * トランザクション管理設定
	 * @param entityManagerFactory
	 * @return
	 */
	@Bean
	 public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
		return jpaTransactionManager;
	}
	


}
