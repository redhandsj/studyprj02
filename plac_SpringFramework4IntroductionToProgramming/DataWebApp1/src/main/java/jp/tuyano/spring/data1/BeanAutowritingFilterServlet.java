package jp.tuyano.spring.data1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * サーブレット親
 */
public class BeanAutowritingFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * リポジトリ
	 * <ul>
	 * <li> インターフェイスですが、@Autowired により、インスタンスが作成される
	 * </ul>
	 */
	@Autowired
	MyPersonDataDaoRepository repository;

	/**
	 * 共通初期化
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		// インスタンス生成時に自動でBean設定
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
}
