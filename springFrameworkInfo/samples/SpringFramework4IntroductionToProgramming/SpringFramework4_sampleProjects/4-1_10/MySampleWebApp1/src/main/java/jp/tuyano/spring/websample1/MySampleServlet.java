package jp.tuyano.spring.websample1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

public class MySampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ApplicationContext app;
	
	@Override
	public void init() throws ServletException {
		super.init();
		app = new ClassPathXmlApplicationContext("/spring/application-config.xml");
	}

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		MyBean mybean1 = (MyBean)app.getBean("mybean1");
		request.setAttribute("mybean", mybean1);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String message = request.getParameter("message");
		MyBean mybean1 = (MyBean)app.getBean("mybean1");
		mybean1.addMessage(message);
		response.sendRedirect("sample");
	}

}
