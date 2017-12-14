★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 10) Spring Data JPA
しおり　：　P.531
URL　:　 http://localhost:8080/SpringDataJPA02/web

★ 2016/11/19(土曜日)に、JPAConfigの勉強の為にSpringDataJPA01から派生して作成



-------------------------------------------------------------------------------




-------------------------------------------------------------------------------
★generate
https://blog.ik.am/entries/258


-------------------------------------------------------------------------------
URL　:　 http://localhost:8080/

★ハマったバグ情報（パッケージ構成をちゃんとしよう）
http://qiita.com/NagaokaKenichi/items/058a7243bd2948de7553

-------------------------------------------------------------------------------
★ bean.properties

jdbc.type=H2
jdbc.scriptLocation=classpath:spring/script.sql
jdbc.driverClassName=org.h2.Driver
jdbc.url=jdbc:h2:mem:mydata
jdbc.username=sa
jdbc.password=

-------------------------------------------------------------------------------
★ application-config.xmlの不要部分

	<bean id="entityManagerFactory" class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="jpaVendorAdapter">
			<bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter">
				<property name="generateDdl" value="true" />
				<property name="database" value="${jdbc.type}" />
			</bean>
		</property>
	</bean>
	
	<!-- jdbc  -->
	<jdbc:embedded-database id="dataSource" type="H2">
		<jdbc:script location="${jdbc.scriptLocation}" />
	</jdbc:embedded-database>

	<!-- リポジトリを検索するパッケージ -->
	<jpa:repositories base-package="jp.tuyano.spring" />
	<!-- リポジトリで使用する transactionManager -->
	<bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
		<property name="entityManagerFactory" ref="entityManagerFactory" />
		<property name="dataSource" ref="dataSource" />
	</bean>
	<!-- 監査情報の設定 -->
	<jpa:auditing auditor-aware-ref="auditorAware" />
	<bean id="auditorAware" class="jp.tuyano.spring.domain.service.OsUserAuditorAware" />

	<!-- Open EntityManager in Viewパターンの設定 
	<mvc:interceptors>
		<mvc:interceptor>
			<mvc:mapping path="/**" />
			<mvc:exclude-mapping path="/**/*.html" />
			<mvc:exclude-mapping path="/**/*.js" />
			<mvc:exclude-mapping path="/**/*.css" />
			<mvc:exclude-mapping path="/**/*.png" />
			<bean class="org.springframework.orm.jpa.support.OpenEntityManagerInViewInterceptor" />
		</mvc:interceptor>
	</mvc:interceptors>
	-->	


