package jp.co.stylez.sepl2.team3a.atm.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.stylez.sepl2.team3a.atm.domain.mst.Bank;
import jp.co.stylez.sepl2.team3a.atm.domain.mst.User;
import jp.co.stylez.sepl2.team3a.atm.domain.trn.Account;

public class AtmServlet extends BeanAutowritingFilterServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		List<User> m_users = userRepository.findAll();
		request.setAttribute("m_users", m_users);
		List<Bank> m_banks = bankRepository.findAll();
		request.setAttribute("m_banks", m_banks);
		List<Account> m_accounts = accountRepository.findAll();
		request.setAttribute("m_accounts", m_accounts);
		request.getRequestDispatcher("/index.jsp").forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
