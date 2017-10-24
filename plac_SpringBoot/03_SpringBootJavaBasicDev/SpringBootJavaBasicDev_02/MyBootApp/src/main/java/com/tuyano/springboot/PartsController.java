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
	 * ラジオボタン
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/radio" , method = RequestMethod.GET)
	public ModelAndView radioBtn(ModelAndView mav){
		mav.setViewName("parts/radioButton");
		mav.addObject("msg","ラジオボタンを選択してボタン押下");
		return mav;
	}

	/**
	 * セレクトボックス
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/select" , method = RequestMethod.GET)
	public ModelAndView selectBox(ModelAndView mav){
		mav.setViewName("parts/select");
		mav.addObject("msg","セレクトボックスを選択してボタン押下");
		return mav;
	}

	
	/**
	 * チェックボックス結果
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/sendChkBox" , method = RequestMethod.POST)
	public ModelAndView sendChkBox(@RequestParam(value="chk1", required=false)boolean chk1, ModelAndView mav){
		String res="";
		try{
			res = "checkbox : " + chk1;
		}catch(NullPointerException e){
			e.printStackTrace();			
		}
		mav.setViewName("parts/chkbox");
		mav.addObject("msg",res);
		return mav;
	}

	/**
	 * ラジオボタン結果
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/sendRadio" , method = RequestMethod.POST)
	public ModelAndView sendRadio(@RequestParam(value="radio1", required=false)String radio1, ModelAndView mav){
		String res="";
		try{
			res = "radio1 : " + radio1;
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		mav.setViewName("parts/radioButton");
		mav.addObject("msg",res);
		return mav;
	}

	/**
	 * ラジオボタン結果
	 * @param mav
	 * @return
	 */
	@RequestMapping(value = "/sendSelect" , method = RequestMethod.POST)
	public ModelAndView sendSelect(
			@RequestParam(value="sel1", required=false)String select1, 
			@RequestParam(value="sel2", required=false)String[] select2, 
			ModelAndView mav){
		String res="";
		try{
			res = "select1 : " + select1 + "\n" +  "select2 : ";
			for(String s : select2) {
				res +=  s + " , ";
			}
		
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		mav.setViewName("parts/select");
		mav.addObject("msg",res);
		return mav;
	}

	
	
}

