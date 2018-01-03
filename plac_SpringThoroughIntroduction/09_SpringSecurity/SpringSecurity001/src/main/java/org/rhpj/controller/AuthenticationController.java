package org.rhpj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenticationController {

	@RequestMapping(path = "/login", method = {RequestMethod.POST, RequestMethod.GET})
	public String viewLoginForm() {
		return "auth/loginForm";
	}

}
