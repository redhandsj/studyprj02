package org.rhpj.config;

import javax.servlet.Filter;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 、サーブレットコンテナの初期化処理
 * @author redhandsj
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO 適用リクエストパターンの設定？
		return new String[] { "/" };
	}

// TODO ここでContextLoaderListenerをどうするか？
// TODO AnnotationConfigWebApplicationContext ？？
// TODO DispatcherServlet
//	 @Override
//	 public void onStartup(ServletContext container) {
//	 // Create the 'root' Spring application context
//	  AnnotationConfigWebApplicationContext rootContext =
//	                       new AnnotationConfigWebApplicationContext();
//	  rootContext.register(WebSecurityConfig.class);
//
//	  // Manage the lifecycle of the root application context
//	  container.addListener(new ContextLoaderListener(rootContext));
//
//	  // Create the dispatcher servlet's Spring application context
//	  AnnotationConfigWebApplicationContext dispatcherContext =
//	                     new AnnotationConfigWebApplicationContext();
//	  dispatcherContext.register(DispatcherConfig.class);
//
//	  // Register and map the dispatcher servlet
//	  ServletRegistration.Dynamic dispatcher =
//	    container.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
//	    dispatcher.setLoadOnStartup(1);
//	    dispatcher.addMapping("/");//	 
//	}


	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return new Filter[] { characterEncodingFilter };
	}

}
