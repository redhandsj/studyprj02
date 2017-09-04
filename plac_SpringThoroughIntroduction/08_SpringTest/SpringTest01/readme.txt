★Spring徹底入門SpringFrameworkによるJavaアプリケーション開発.pdf
 - (CHAPTER 08) Spring Test (P.401 - 430)
しおり　：　P.
URL　:　 http://localhost:8080/SpringTest01/web

★ 2017/09/04(月)に、SpringTestの勉強の為にSpringTest01から派生して作成



//==========================================================================================================
// 08.01 Spring Testとは 
//==========================================================================================================
★ 提供機能
 - JUnit【2】やTestNG【3】といったテスティングフレームワーク上でSpringのDIコンテナを動かす機能 
 - トランザクション制御をテスト向けに最適化する機能
 - アプリケーションサーバーを使わずにSpring MVCの動作を再現する機能 
 - テストデータをセットアップするためのSQLを実行する機能
 - RestTemplateを使用したHTTP通信に対してモックレスポンスを返却する機能



//==========================================================================================================
// 08.02 DIコンテナ管理のBeanに対するテスト 
//==========================================================================================================
★ DIコンテナ内のBeanに対する結合テスト
 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 → MessageServiceIntegrationTest エラー
 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!


★ DIコンテナのライフサイクル制御
 - 



//==========================================================================================================
// 08.03 データベースアクセスを伴う処理のテスト
//==========================================================================================================
★ 





//==========================================================================================================
// 08.04 Spring MVCのテスト 
//==========================================================================================================
★ 
















//==========================================================================================================
// 問題
//==========================================================================================================

//==========================================================================================================
// 未整頓メモ（エラー）MessageServiceIntegrationTest.java
//==========================================================================================================
package jp.tuyano.spring.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import jp.tuyano.spring.config.JpaConfig;
import jp.tuyano.spring.config.WebMvcConfig;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {WebMvcConfig.class})
//@ContextConfiguration(classes = {SpringMvcInitializer.class, WebMvcConfig.class, JpaConfig.class})
@ContextConfiguration(classes = {WebMvcConfig.class, JpaConfig.class})
@RunWith(SpringRunner.class)
public class MessageServiceIntegrationTest {

	@Autowired
	MessageService service; 
	
	@Test
	public void testGetMessageByCode() {
		String actualMessage = service.getMessageByCode("greeting");
		assertThat(actualMessage, is("Hello!!"));
	}
}


------------------------------------------------------------------------------------------------------------



java.lang.IllegalStateException: Failed to load ApplicationContext
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:124)
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:83)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:117)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:83)
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:230)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:228)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:287)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:289)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:247)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:94)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:70)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:191)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'mvcValidator' defined in org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration: Invocation of init method failed; nested exception is javax.el.ELException: Provider com.sun.el.ExpressionFactoryImpl not found
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1578)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:545)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:482)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:775)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:861)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:541)
	at org.springframework.test.context.support.AbstractGenericContextLoader.loadContext(AbstractGenericContextLoader.java:128)
	at org.springframework.test.context.support.AbstractGenericContextLoader.loadContext(AbstractGenericContextLoader.java:60)
	at org.springframework.test.context.support.AbstractDelegatingSmartContextLoader.delegateLoading(AbstractDelegatingSmartContextLoader.java:108)
	at org.springframework.test.context.support.AbstractDelegatingSmartContextLoader.loadContext(AbstractDelegatingSmartContextLoader.java:251)
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:98)
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:116)
	... 25 more
Caused by: javax.el.ELException: Provider com.sun.el.ExpressionFactoryImpl not found
	at javax.el.FactoryFinder.newInstance(FactoryFinder.java:97)
	at javax.el.FactoryFinder.find(FactoryFinder.java:193)
	at javax.el.ExpressionFactory.newInstance(ExpressionFactory.java:185)
	at javax.el.ExpressionFactory.newInstance(ExpressionFactory.java:156)
	at org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator.buildExpressionFactory(ResourceBundleMessageInterpolator.java:74)
	at org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator.<init>(ResourceBundleMessageInterpolator.java:40)
	at org.hibernate.validator.internal.engine.ConfigurationImpl.getDefaultMessageInterpolator(ConfigurationImpl.java:421)
	at org.springframework.validation.beanvalidation.LocalValidatorFactoryBean.afterPropertiesSet(LocalValidatorFactoryBean.java:264)
	at org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean.afterPropertiesSet(OptionalValidatorFactoryBean.java:40)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1637)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1574)
	... 40 more
Caused by: java.lang.ClassNotFoundException: com.sun.el.ExpressionFactoryImpl
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at javax.el.FactoryFinder.newInstance(FactoryFinder.java:83)
	... 50 more


//==========================================================================================================
// <END>
//==========================================================================================================
