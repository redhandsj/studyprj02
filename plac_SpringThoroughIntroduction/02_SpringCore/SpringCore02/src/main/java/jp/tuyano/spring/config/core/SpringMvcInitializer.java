package jp.tuyano.spring.config.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jp.tuyano.spring.config.MvcConfig;


public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MvcConfig.class };
//		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//return new Class[] { MvcConfig.class };
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
}