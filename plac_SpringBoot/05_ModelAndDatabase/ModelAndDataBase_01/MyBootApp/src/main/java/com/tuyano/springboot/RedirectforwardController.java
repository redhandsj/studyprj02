package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(("redirect_forward"))
public class RedirectforwardController {
		
	/**
	 * 動作確認ページ
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/index" , method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("redirect_forward/index");
		mav.addObject("msg","動作を選択してください。");
		return mav;
	}

	/**
	 * 動作確認（リダイレクト）
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/redirect" , method = RequestMethod.GET)
	public ModelAndView redirect(ModelAndView mav){
//		return "redirect:redirect_forward/redirect";
		return new ModelAndView("redirect:redirectToHtml");
	}

	/**
	 * 動作確認（リダイレクト）
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/redirectToHtml" , method = RequestMethod.GET)
	public ModelAndView redirectToHtml(ModelAndView mav){
		mav.setViewName("redirect_forward/redirect");
		mav.addObject("msg","動作を選択してください。");
		return mav;
	}

	/**
	 * 動作確認（フォワード）
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/forward" , method = RequestMethod.GET)
	public ModelAndView forward(ModelAndView mav){
//		return "redirect:redirect_forward/redirect";
		return new ModelAndView("forward:forwardToHtml");
	}

	/**
	 * 動作確認（フォワード）
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/forwardToHtml" , method = RequestMethod.GET)
	public ModelAndView forwardToHtml(ModelAndView mav){
		mav.setViewName("redirect_forward/forward");
		mav.addObject("msg","動作を選択してください。");
		return mav;
	}

	
}

