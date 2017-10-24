package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(("parts"))
public class PartsController {
	
	/**
	 * チェックボックス
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/chkbox" , method = RequestMethod.GET)
	public ModelAndView chkBox(ModelAndView mav){
		mav.setViewName("parts/chkbox");
		mav.addObject("msg","チェックボックスを選択してボタン押下");
		return mav;
	}

	/**
	 * チェックボックス
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/sendChkBox" , method = RequestMethod.POST)
	public ModelAndView sendChkBox(@RequestParam(value="chk1", required=false)boolean chk1, ModelAndView mav){
		String res="";
		try{
			res = "checkbox : " + chk1;
		}catch(NullPointerException e){
			
		}
		mav.setViewName("parts/chkbox");
		mav.addObject("msg",res);
		return mav;
	}

	
	
}

