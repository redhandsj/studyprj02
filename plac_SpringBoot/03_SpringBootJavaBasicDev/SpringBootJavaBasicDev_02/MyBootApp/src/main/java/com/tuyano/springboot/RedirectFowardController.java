package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(("redirect_foward"))
public class RedirectFowardController {
		
	/**
	 * 動作確認ページ
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("redirect_foward/index");
		mav.addObject("msg","動作を選択してください。");
		return mav;
	}

	/**
	 * 動作確認（リダイレクト）
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/redirect" , method = RequestMethod.GET)
	public String redirect(ModelAndView mav){
		return "redirect:redirect_foward/redirect";
	}

	
	
}

