package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * <ul>
 * <li> RESTfulシステム
 * </ul>
 */
//@RestController

/**
 * <ul>
 * <li> 
 * </ul>
 */
@Controller
public class HeloController {

	/**
	 * 数値アクセス(list_03_16)
	 * @param mav データ and Viewモデル
	 * @return　テンプレート名
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index");
		mav.addObject("msg","お名前書いて送信してください。");
		return mav;
	}

	/**
	 * 数値アクセス(list_03_16)
	 * @param mav データ and Viewモデル
	 * @return　テンプレート名
	 */
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav){
		mav.addObject("msg","こんにちわ、 " + str + " さん！");
		mav.addObject("value",str);
		mav.setViewName("index");
		return mav;
	}



//	/**
//	 * 数値アクセス(list_03_14)
//	 * @param num URLからのパス
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{num}")
//	public ModelAndView index(@PathVariable int num, ModelAndView mav){
//		int res = 0;
//		for(int i=1;i<=num;i++){
//			res += i;
//		}
//		mav.addObject("msg","total: " + res);
//		mav.setViewName("index");
//		return mav;
//	}

//	/**
//	 * 数値アクセス(list_03_13)
//	 * @param num URLからのパス
//	 * @param model データモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{num}")
//	public String index(@PathVariable int num, Model model){
//		int res = 0;
//		for(int i=1;i<=num;i++){
//			res += i;
//		}
//		model.addAttribute("msg","total: " + res);
//		return "index";
//	}

	
//	/**
//	 * 名前
//	 */
//	String[] names = {"tuyano","hanako","taro","sachiko","ichiro"};
//
//	/**
//	 * メールアドレス
//	 */
//	String[] mails = {"syoda@tuuyano.com","hanako@flower","taro@yamada","sachiko@happy","ichiro@baseball"};
//
//	/**
//	 * インデックス
//	 * @param id アクセスパスの引数
//	 * @return レスポンス
//	 */
//	@RequestMapping("/{id}")
//	public DataObject index(@PathVariable int id){
//		return new DataObject(id,names[id],mails[id]);
//	}
}

//class DataObject {
//	private int id;
//	private String name;
//	private String value;
//
//	public DataObject(int id, String name, String value){
//		super();
//		this.id = id;
//		this.name = name;
//		this.value = value;
//	}
//	
//	public int getId(){ return id; }
//	public void setId(int id){ this.id = id; }
//	public String getName(){ return name; }
//	public void setName(String name){ this.name = name; }
//	public String getValue(){ return value; }
//	public void setValue(String value){ this.value = value; }
//}
