package jp.tuyano.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 認証用
 */
@Controller
public class AuthenticationController {
	/**
	 * ログインフォーム指定
	 * @return ログインJSP名
	 */
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String get(final Model model, 
			@RequestParam(required = false, defaultValue = "") final String error,
			@RequestParam(required = false, defaultValue = "") final String from) {
		model.addAttribute("isError", !error.isEmpty());
		model.addAttribute("fromLogout", from.contains("logout"));
		return "views/loginForm";
	}

}
