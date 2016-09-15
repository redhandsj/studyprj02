package jp.tuyano.spring.data1;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public abstract class AbstractMyPersonDataDao<T> implements MyPersonDataDao<T> {
	/**
	 * 初期化
	 */
	public void init(){
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
}
