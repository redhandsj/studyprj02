★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 09) Spring Security
しおり　：　P.455      (～492)
パスワードのハッシュ化から

URL　:　 http://localhost:8080/SpringSecurity02/web

ログインの場合は以下：
http://localhost:8080/SpringSecurity02/login




９章のサンプルは糞！

-------------------------------------------------------------------------------
★ Lombok 
 - http://qiita.com/opengl-8080/items/671ffd4bf84fe5e32557
 - STS.exeと同じ場所にjarを置く
 ―STS.ini に「-javaagent:lombok.jar」を追記

-------------------------------------------------------------------------------
★結局動いたものを参照したページ
http://javatechnology.net/spring/spring-security-basically/

★★★★★超重要ページ★★★★★
http://namihira.hatenablog.com/entry/20160817/1471396975

  <sec:http auto-config="true" >
        <!-- 認可の設定 -->
        <sec:intercept-url pattern="/top*" access="hasAnyRole('ROLE_ADMIN', 'ROLE_USER')" />
        <sec:intercept-url pattern="/admin*" access="hasRole('ROLE_ADMIN')" />
        <sec:intercept-url pattern="/user*" access="hasRole('ROLE_USER')" />
         
        <!-- 権限なし時の遷移先 -->
        <sec:access-denied-handler error-page="/403" />
         
        <!-- 認証のログイン処理 -->
        <sec:form-login
            login-page="/"
            default-target-url="/top"
            authentication-failure-url="/error"
            login-processing-url="/j_spring_security_check"/>
         
        <!-- 認証のログアウト処理 -->
        <sec:logout
            logout-url="/logout"
            logout-success-url="/"
            invalidate-session="true"/>
        <!-- anonymousユーザのROLE -->
        <sec:anonymous granted-authority="ROLE_ANONYMOUS" />
    </sec:http>



-------------------------------------------------------------------------------
★eclipseのエラーを防止「Failed to load JavaHL Library」
http://d.hatena.ne.jp/watanata2000/20100730/1280470753


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



