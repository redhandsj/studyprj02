package jp.co.stylez.sepl2.team3a.atm.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import jp.co.stylez.sepl2.team3a.atm.service.mst.BankRepository;
import jp.co.stylez.sepl2.team3a.atm.service.mst.UserRepository;
import jp.co.stylez.sepl2.team3a.atm.service.trn.AccountRepository;

/**
 * サーブレット親
 */
public class BeanAutowritingFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * リポジトリ
	 */
	@Autowired
	UserRepository userRepository;
	@Autowired
	BankRepository bankRepository;
	@Autowired
	AccountRepository accountRepository;

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
