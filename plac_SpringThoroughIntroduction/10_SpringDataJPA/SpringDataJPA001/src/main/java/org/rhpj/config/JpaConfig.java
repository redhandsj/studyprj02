package org.rhpj.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
// ■10.5.3  EntityManagerFactoryの定義
@EnableTransactionManagement
// TODO Spring Data JPAの初期設定（Repositoryクラスが格納されているパッケージ名を指定）
@EnableJpaRepositories("org.rhpj.domain.repository")
public class JpaConfig {
	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		// Hibernate向けのJPA実装クラス
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		// DB製品の選択
		vendorAdapter.setDatabase(Database.H2);
		// 発行SQLをコンソールに出力
		vendorAdapter.setShowSql(true);
		return vendorAdapter;
	}

	/**
	 * TODO ■10.5.3  EntityManagerFactoryの定義
	 * @param dataSource
	 * @return
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		// EntityManagerFactory定義
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean(); 
		// 永続化に使用するデータソースを指定
		factory.setDataSource(dataSource); 
		// EntityManagerで扱う Entityクラスのパッケージ指定
		factory.setPackagesToScan("org.rhpj.domain.model");
		// JpaVendorAdapter指定
		factory.setJpaVendorAdapter(jpaVendorAdapter());
		return factory;
	}
	/**
	 * TODO ■10.5.4 JpaTransactionManagerの定義
	 * @param entityManagerFactory
	 * @return
	 */
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		// @Transactionalアノテーションをメソッドに付加するだけで、JPAのトランザクション管理が可能
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
		return jpaTransactionManager;
	}
}
