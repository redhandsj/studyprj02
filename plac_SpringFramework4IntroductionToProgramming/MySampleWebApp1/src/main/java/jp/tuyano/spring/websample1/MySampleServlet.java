package jp.tuyano.spring.websample1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class MySampleServlet
 */
public class MySampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private MyBean2 mybean2;
	@Autowired
	private MyBeanEventService beanService;
	
	@Override
	public void init() throws ServletException {
		super.init();
		SpringBeanAutowiringSupport
			.processInjectionBasedOnCurrentContext(this);
	}

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("mybean", mybean2);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String message = request.getParameter("message");
		beanService.doService(message);
		response.sendRedirect("sample");
	}
}
