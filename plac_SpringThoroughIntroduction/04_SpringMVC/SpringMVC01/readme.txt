★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 09) Spring Security
しおり　：　P.190      (～202)
URL　:　 http://localhost:8080/SpringMVC01/echo
※残りは、読んでおく。

-------------------------------------------------------------------------------
★以下のエラーでバージョンを変更（4.3.3.RELEASE に変更）
    <!-- <spring-framework.version>4.0.3.RELEASE</spring-framework.version> -->
    <spring-framework.version>4.3.3.RELEASE</spring-framework.version>
Caused by: org.springframework.beans.BeanInstantiationException: Could not instantiate bean class [org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter]: Constructor threw exception; nested exception is java.lang.NoSuchMethodError: org.springframework.util.AntPathMatcher.setCaseSensitive(Z)V

-------------------------------------------------------------------------------
★generate
https://blog.ik.am/entries/258


-------------------------------------------------------------------------------
URL　:　 http://localhost:8080/


--------------------------------------------

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
★ application-config.xml

<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:jpa="http://www.springframework.org/schema/data/jpa"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xmlns:jdbc="http://www.springframework.org/schema/jdbc"
	xsi:schemaLocation="http://www.springframework.org/schema/beans 
		http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/data/jpa
		http://www.springframework.org/schema/data/jpa/spring-jpa.xsd
		http://www.springframework.org/schema/tx 
		http://www.springframework.org/schema/tx/spring-tx.xsd
		http://www.springframework.org/schema/jdbc
		http://www.springframework.org/schema/jdbc/spring-jdbc.xsd
		http://www.springframework.org/schema/context 
		http://www.springframework.org/schema/context/spring-context.xsd">
    
	<context:property-placeholder location="classpath:spring/bean.properties" />
	
 	<!-- アノテーションによるBean配置などの処理を行えるようにしたもの -->
 	<context:annotation-config />
 	<!-- コンポーネントを検索するパッケージを指定 -->
	<context:component-scan base-package="jp.tuyano.spring.data1" />
	
	<bean class="org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor" />

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
	<jpa:repositories base-package="jp.tuyano.spring.data1" />
	<!-- リポジトリで使用する transactionManager -->
	<bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
		<property name="entityManagerFactory" ref="entityManagerFactory" />
		<property name="dataSource" ref="dataSource" />
	</bean>

	<!-- list_08_25 Validator用のBeanを登録 -->
	<bean id="validator" class="org.springframework.validation.beanvalidation.LocalValidatorFactoryBean" />
	
	
</beans>
★



