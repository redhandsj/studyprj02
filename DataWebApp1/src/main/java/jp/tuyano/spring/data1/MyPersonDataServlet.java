package jp.tuyano.spring.data1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Servlet implementation class MyPersonDataServlet
 */
public class MyPersonDataServlet extends BeanAutowritingFilterServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Beanとして登録されているものが自動的に代入される
	 */
	@Autowired
	private MyPersonDataDaoImpl dao;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// /personにアクセスすると、現在のテーブル内容を表示する
		//List<MyPersonData> list = dao.getAllEntity();
		//List<MyPersonData> list = repository.findAll(); //☆
		
		//this.List08_19_doGet(request,response);
		this.list_08_21_doGet(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		// フォームからアクセスすると、データを追加する

//		int age = 0;
//		if(!("".equals(request.getParameter("age")))){
//			age = Integer.parseInt(request.getParameter("age"));
//		}
//		MyPersonData entity = new MyPersonData(name, mail, age);
//		//dao.addEntity(entity);
//		repository.saveAndFlush(entity); //☆
//		// リダイレクト
//		response.sendRedirect("person");

//		String name = request.getParameter("name");
//		List<MyPersonData> list = dao.findByName(name);
//		request.setAttribute("entities", list);
//		request.getRequestDispatcher("/index.jsp").forward(request, response);

		//this.list_08_17_doPost(request,response);
		this.list_08_23_doPost(request,response);
	}
	
	//=======================================================================
	// リスト別コード
	//=======================================================================
	/**
	 * SpringFramework4_プログラミング入門 : P.398
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list_08_17_doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 画面からのパラメータ取得
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		List<MyPersonData> list = repository.findByNameLikeOrMailLike("%" + name + "%", "%" + mail + "%");
		request.setAttribute("entities", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);		
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.406
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list_08_19_doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<String> list = repository.getAllName(); //☆
		request.setAttribute("entities", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.409
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list_08_21_doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List<MyPersonData> list = dao.getAllEntity(); //☆
		request.setAttribute("entities", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);			
	}
	/**
	 * SpringFramework4_プログラミング入門 : P.412
	 * @param request リクエスト
	 * @param response レスポンス
	 * @throws ServletException
	 * @throws IOException
	 */
	private void list_08_23_doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// 画面からのパラメータ取得
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		List<MyPersonData> list = dao.findByName(name);
		request.setAttribute("entities", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);		
	}
	
}
