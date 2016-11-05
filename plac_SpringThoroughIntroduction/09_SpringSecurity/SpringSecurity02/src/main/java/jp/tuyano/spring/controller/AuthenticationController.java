package jp.tuyano.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.model.User;
import jp.tuyano.spring.domain.service.BeanAutowritingFilter;

/**
 * 認証用
 */
@Controller
public class AuthenticationController extends BeanAutowritingFilter{
	/**
	 * ログインフォーム指定
	 * @return ログインJSP名
	 */
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String auth(final Model model, 
			@RequestParam(required = false, defaultValue = "") final String error,
			@RequestParam(required = false, defaultValue = "") final String from) {
		model.addAttribute("isError", !error.isEmpty());
		model.addAttribute("fromLogout", from.contains("logout"));
		return "views/loginForm";
	}
//	/**
//	 * ログインエラー時の表示
//	 * @return ログインJSP名
//	 */
//	@RequestMapping(path="/login",method=RequestMethod.POST, params="error=true")
//	public String error(final Model model, 
//			@RequestParam(required = false, defaultValue = "") final String error,
//			@RequestParam(required = false, defaultValue = "") final String from) {
//		model.addAttribute("isError", !error.isEmpty());
//		model.addAttribute("fromLogout", from.contains("logout"));
//		return "views/error";
//	}

	/**
	 * ログイン成功時のホーム
	 * @return JSP名
	 */
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public void home(HttpServletRequest request, HttpServletResponse response) {
		this.test(request,response);
		try {
			request.getRequestDispatcher("/index.jsp").forward(request,  response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * データ格納
	 * @param request
	 * @param response
	 */
	private void test(HttpServletRequest request, HttpServletResponse response){
		request.setAttribute("msg", "please type my person data.");
		List<Room> rooms = roomRepository.findAll();
		request.setAttribute("room", rooms);
		List<User> users = userRepository.findAll();
		request.setAttribute("user", users);
		
		
		
		
	}

}
