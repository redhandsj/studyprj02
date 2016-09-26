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
		mav.addObject("msg","フォームを送信ください。");
		return mav;
	}

	/**
	 * POST(list_03_18)
	 * @param str テキスト
	 * @param check1 チェックボックス1（必須ではない）
	 * @param radio1 ラジオボタン1（必須ではない）
	 * @param select1 選択1（必須ではない）
	 * @param select2 選択2（必須ではない）
	 * @param mav データ and Viewモデル
	 * @return　テンプレート名
	 */
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(
			@RequestParam("text1")String str,
			@RequestParam(value="check1",required=false)boolean check1,
			@RequestParam(value="radio1",required=false)String radio1,
			@RequestParam(value="select1",required=false)String select1,
			@RequestParam(value="select2",required=false)String[] select2,
			ModelAndView mav){
		String res="";
		try{
			res = "check : " + check1 +
					"  radio : " + radio1 +
					"  select : " + select1 +
					"\nselect2:";
		}catch(NullPointerException e){}
		try{
			res += select2[0];
			for(int i=1;i<select2.length;i++){
				res += ", " + select2[i];
			}
		}catch(NullPointerException e){
			res += "null";
		}

		mav.addObject("msg",res);
		mav.setViewName("index");
		return mav;
	}

	@RequestMapping("/other")
	public String other(){
		return "redirect:/";
	}

	@RequestMapping("/home")
	public String home(){
		return "forward:/";
	}


//	/**
//	 * 数値アクセス(list_03_16)
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/",method=RequestMethod.POST)
//	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav){
//		mav.addObject("msg","こんにちわ、 " + str + " さん！");
//		mav.addObject("value",str);
//		mav.setViewName("index");
//		return mav;
//	}

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
