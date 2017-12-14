package jp.tuyano.spring.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import jp.tuyano.spring.domain.repository.MyPersonDataDaoRepository;
import jp.tuyano.spring.domain.repository.RoomRepository;
import jp.tuyano.spring.domain.repository.UserRepository;

/**
 * サーブレット親
 */
public class BeanAutowritingFilter {
	/**
	 * リポジトリ
	 * <ul>
	 * <li> インターフェイスですが、@Autowired により、インスタンスが作成される
	 * </ul>
	 */
	@Autowired
	protected MyPersonDataDaoRepository repository;
	@Autowired
	protected RoomRepository roomRepository;
	@Autowired
	protected UserRepository userRepository;
	
	/**
	 * 共通初期化
	 */
	public BeanAutowritingFilter(){
		// インスタンス生成時に自動でBean設定
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
}
