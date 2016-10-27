package jp.tuyano.spring.domain.service;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * MyPersonDataDaoの抽象クラス
 * @param <T>
 */
public abstract class AbstractMyPersonDataDao<T> implements MyPersonDataDao<T> {
	/**
	 * 初期化
	 */
	public void init(){
		// @AutowiredなどのアノテーションでフィールドにBeanを関連づける機能を使えるようにする
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
}
