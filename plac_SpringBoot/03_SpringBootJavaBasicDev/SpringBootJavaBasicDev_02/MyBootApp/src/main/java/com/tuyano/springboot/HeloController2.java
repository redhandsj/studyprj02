package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController2 {
//	/**
//	 * thymeleafのコントローラ
//	 * @return
//	 */
//	@RequestMapping("/")
//	public String index(){
//		return "index";
//	}

//	/**
//	 * Thymeleafで値を表示する
//	 * @param num
//	 * @return
//	 */
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num, Model model){
//		int res = 0;
//		for(int i=1;i <= num ; i++){
//			res+=i;
//		}
//		model.addAttribute("msg","total : " + res);
//		return "index";
//	}

//	/**
//	 * ModelAndViewで返す
//	 * @param num
//	 * @return
//	 */
//	@RequestMapping("/{num}")
//	public ModelAndView index(@PathVariable int num, ModelAndView mav){
//		int res = 0;
//		for(int i=1;i <= num ; i++){
//			res+=i;
//		}
//		mav.addObject("msg","ModelAndView total : " + res);
//		mav.setViewName("index");
//		return mav;
//	}

	/**
	 * 
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		mav.addObject("msg","お名前を書いて送信してください。");
		return mav;
	}

	/**
	 * 
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/" , method = RequestMethod.POST)
	public ModelAndView index(@RequestParam("text1")String str, ModelAndView mav){
		mav.addObject("msg","こんにちわ、" + str + "さん！");
		mav.addObject("value",str);
		mav.setViewName("index");
		return mav;
	}

}

