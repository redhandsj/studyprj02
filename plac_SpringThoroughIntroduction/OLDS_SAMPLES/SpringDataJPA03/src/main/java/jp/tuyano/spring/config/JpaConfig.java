package jp.tuyano.spring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
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

	/**
	 * 環境変数を扱う為の変数
	 */
	@Autowired
    private Environment env;

	/**
	 * 使用するデータソースを指定
	 * @return DataSource
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
	 * データ構築（H2でテーブル構築）
	 * @return EmbeddedDatabase
	 */
	@Bean(destroyMethod = "shutdown")
	public EmbeddedDatabase dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).
				setScriptEncoding("UTF-8").
				addScript(env.getProperty("jdbc.scriptLocation")).
				build();
	}

	/**
	 * 
	 * @return JpaVendorAdapter
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
		Properties jpaProperties = new Properties();
		// NamingStrategy設定(ver 4)
		//jpaProperties.put("hibernate.ejb.naming_strategy","org.hibernate.cfg.ImprovedNamingStrategy");
		// NamingStrategy設定(ver 5)
		jpaProperties.put("hibernate.physical_naming_strategy","jp.tuyano.spring.domain.PhysicalNamingStrategyImpl");
		// generated ddl 設定
//		jpaProperties.put("hibernate.ddl-auto", "create");
//		jpaProperties.put("generate-ddl", "true");
//		jpaProperties.put("hibernate.show_sql", "true");
//		jpaProperties.put("hibernate.format_sql", "true");
//		jpaProperties.put("hibernate.hbm2ddl.export", "true");
//		jpaProperties.put("hibernate.hbm2ddl.delimiter", ";");
//		jpaProperties.put("hibernate.hbm2ddl.outputfilename", "versioning-ddl.sql");		
//		jpaProperties.put("hibernate.hbm2ddl.format", "true");		
//		jpaProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
//		jpaProperties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		factory.setJpaProperties(jpaProperties);
		factory.afterPropertiesSet();
		
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
