package com.tuyano.springboot;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tuyano.springboot.repositories.MyDataRepository;

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

	@Autowired
	MyDataRepository repository;

	/**
	 * 起動時に実行されるメソッド
	 */
	@PostConstruct
	public void init(){
		MyData d1 = new MyData();
		d1.setName("aaaaa");
		d1.setAge(10);
		d1.setMail("aaaaa@bbb.com");
		d1.setMemo("090999999");
		repository.saveAndFlush(d1);
		
		MyData d2 = new MyData();
		d2.setName("bbbbb");
		d2.setAge(20);
		d2.setMail("bbbbb@bbb.com");
		d2.setMemo("080888888");
		repository.saveAndFlush(d2);

		MyData d3 = new MyData();
		d3.setName("ccccc");
		d3.setAge(30);
		d3.setMail("ccccc@bbb.com");
		d3.setMemo("070777777");
		repository.saveAndFlush(d3);
	}

	/**
	 * 削除( list_05_14 )
	 * @param id データ検索キー
	 * @param mav モデルビューオブジェクト
	 * @return モデルビューオブジェクト
	 */
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id, ModelAndView mav){
		mav.setViewName("delete");
		mav.addObject("title","delete mydata.");
		MyData data = repository.findById((long)id);
		mav.addObject("formModel",data);
		return mav;
	}

	/**
	 * 削除の更新( list_05_14 )
	 * @param mydata フォームデータ
	 * @param mav モデルビューオブジェクト
	 * @return モデルビューオブジェクト
	 */
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView remove(@RequestParam long id, ModelAndView mav){
		repository.delete(id);
		return new ModelAndView("redirect:/");
	}

	
	/**
	 * 編集( list_05_12 )
	 * @param mydata フォームデータ
	 * @param id データ検索キー
	 * @param mav モデルビューオブジェクト
	 * @return モデルビューオブジェクト
	 */
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute MyData mydata,@PathVariable int id, ModelAndView mav){
		mav.setViewName("edit");
		mav.addObject("title","edit mydata.");
		MyData data = repository.findById((long)id);
		mav.addObject("formModel",data);
		return mav;
	}

	/**
	 * 更新( list_05_12 )
	 * @param mydata フォームデータ
	 * @param mav モデルビューオブジェクト
	 * @return モデルビューオブジェクト
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView update(@ModelAttribute MyData mydata, ModelAndView mav){
		repository.saveAndFlush(mydata);
		return new ModelAndView("redirect:/");
	}

	
	/**
	 * 数値アクセス( list_05_17 )
	 * @param mydata フォームデータ
	 * @param mav モデルビューオブジェクト
	 * @return　テンプレート名
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(@ModelAttribute("formModel") MyData mydata, ModelAndView mav){
		mav.setViewName("index");
		mav.addObject("msg","this is sample content.");
		mav.addObject("formModel", mydata);
		Iterable<MyData> list = repository.findAll();
		mav.addObject("datalist",list);
		return mav;
	}

	/**
	 * 数値アクセス( list_05_17 )
	 * @param mydata フォームデータ
	 * @param result バリデーションチェックの結果
	 * @param mav モデルビューオブジェクト
	 * @return　テンプレート名
	 */
	@RequestMapping(value="/", method=RequestMethod.POST)
	@Transactional(readOnly=false)
	public ModelAndView form(
			@ModelAttribute("formModel") @Validated MyData mydata,
			BindingResult result,
			ModelAndView mav){
		ModelAndView res = null;
		if(!result.hasErrors()){
			// バリデーションエラーなし
			repository.saveAndFlush(mydata);
			res = new ModelAndView("redirect:/");
		}else{
			// バリデーションエラーあり
			mav.setViewName("index");
			mav.addObject("msg","sorry, error is occured...");
			Iterable<MyData> list = repository.findAll();
			mav.addObject("datalist",list);
			res = mav;
		}
		return res;
	}

//	/**
//	 * 数値アクセス( list_05_08 )
//	 * @param mydata フォームデータ
//	 * @param mav モデルビューオブジェクト
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView index(@ModelAttribute("formModel") MyData mydata, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","this is sample content.");
//		Iterable<MyData> list = repository.findAll();
//		mav.addObject("datalist",list);
//		return mav;
//	}
//
//	/**
//	 * 数値アクセス( list_05_08 )
//	 * @param mydata フォームデータ
//	 * @param mav モデルビューオブジェクト
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	@Transactional(readOnly=false)
//	public ModelAndView form(@ModelAttribute("formModel") MyData mydata, ModelAndView mav){
//		repository.saveAndFlush(mydata);
//		return new ModelAndView("redirect:/");
//	}

	//	/**
//	 * 数値アクセス( list_05_05 )
//	 * @param mav
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","this is sample content.");
//		ArrayList<DataObject> data = new ArrayList<DataObject>();
//		Iterable<MyData> list = repository.findAll();
//		mav.addObject("data",list);
//		return mav;
//	}

//	/**
//	 * 数値アクセス( list_04_48 )
//	 * @param mav
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","data table.");
//		ArrayList<DataObject> data = new ArrayList<DataObject>();
//		data.add(new DataObject(0,"taro","taro@yamada"));
//		data.add(new DataObject(1,"hanako","hanako@flower"));
//		data.add(new DataObject(2,"sachiko","sachiko@happy"));
//		mav.addObject("data",data);
//		return mav;
//	}

//	/**
//	 * 数値アクセス( list_04_36 )
//	 * @param mav
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","type a number...");
//		return mav;
//	}

//	/**
//	 * フォーム送信( list_04_36 )
//	 * @param text1
//	 * @param mav
//	 * @return
//	 */
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public ModelAndView send(@RequestParam int num, ModelAndView mav){
//		mav.setViewName("index");
//		int total = 0;
//		for(int i= 1 ; i <= num;i++){
//			total += i;
//		}
//		mav.addObject("msg","total: " + total + " !!");
//		return mav;
//	}

//	/**
//	 * 数値アクセス( list_04_39 )
//	 * @param mav
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		return mav;
//	}

//	/**
//	 * 数値アクセス( list_04_36 )
//	 * @param mav
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("val","please type...");
//		return mav;
//	}
//
//	/**
//	 * フォーム送信( list_04_36 )
//	 * @param text1
//	 * @param mav
//	 * @return
//	 */
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public ModelAndView send(@RequestParam String text1, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("val","you typed: '" + text1 + "'.");
//		return mav;
//	}

//	/**
//	 * 数値アクセス( list_04_34 )
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public String index(){
//		return "index";
//	}

//	/**
//	 * 数値アクセス(list_04_29 )
//	 * @param tax
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_25 )tax
//	 * @param tax
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{tax}")
//	public ModelAndView index(@PathVariable int tax, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("tax",tax);
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_23 )インライン
//	 * @param num
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		ArrayList<DataObject> data = new ArrayList<DataObject>();
//		data.add(new DataObject(0,"taro","taro@yamada"));
//		data.add(new DataObject(1,"hanako","hanako@flower"));
//		data.add(new DataObject(2,"sachiko","sachiko@happy"));
//		mav.addObject("data",data);
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_21)
//	 * @param num
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{num}")
//	public ModelAndView index(@PathVariable int num, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("num",num);
//		if(num >= 0){
//			mav.addObject("check","num >= data.size() ? 0 : num");
//		}else{
//			mav.addObject("check","num <= data.size() * -1 ? 0 : num * -1");
//		}
//		ArrayList<DataObject> data = new ArrayList<DataObject>();
//		data.add(new DataObject(0,"taro","taro@yamada"));
//		data.add(new DataObject(1,"hanako","hanako@flower"));
//		data.add(new DataObject(2,"sachiko","sachiko@happy"));
//		mav.addObject("data",data);
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_19)
//	 * @param month
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		ArrayList<String[]> data = new ArrayList<String[]>();
//		data.add(new String[]{"taro","taro@yamada","090-999-999"});
//		data.add(new String[]{"hanako","hanako@flower","080-888-888"});
//		data.add(new String[]{"sachiko","sachiko@happy","070-777-777"});
//		mav.addObject("data",data);
//		return mav;
//	}

//	/**
//	 * 数値アクセス(list_04_17)
//	 * @param month
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{month}")
//	public ModelAndView index(@PathVariable int month, ModelAndView mav){
//		mav.setViewName("index");
//		int m = Math.abs(month) % 12;
//		m = m == 0 ? 12 : m;
//		mav.addObject("month",m);
//		mav.addObject("check",Math.floor(m / 3));
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_15)
//	 * @param id
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{id}")
//	public ModelAndView index(@PathVariable int id, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("id",id);
//		mav.addObject("check",id>=0);
//		mav.addObject("trueVal","POSITIVE!");
//		mav.addObject("falseVal","negative...");
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_13)
//	 * @param id
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/{id}")
//	public ModelAndView index(@PathVariable int id, ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("id",id);
//		mav.addObject("check",id%2==0);
//		mav.addObject("trueVal","Even number!");
//		mav.addObject("falseVal","Odd number...");
//		return mav;
//	}

	//	/**
//	 * 数値アクセス(list_04_10)
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","message 1<hr/>message 2<br/>message 3");
//		return mav;
//	}

//	/**
//	 * 数値アクセス(list_04_07)
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping("/")
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","cuurent data.");
//		DataObject obj = new DataObject(123,"hanako","hanako@flower");
//		mav.addObject("object",obj);
//		return mav;
//	}

//	/**
//	 * 数値アクセス(list_03_16)
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav){
//		mav.setViewName("index");
//		mav.addObject("msg","フォームを送信ください。");
//		return mav;
//	}

//	/**
//	 * POST(list_03_18)
//	 * @param str テキスト
//	 * @param check1 チェックボックス1（必須ではない）
//	 * @param radio1 ラジオボタン1（必須ではない）
//	 * @param select1 選択1（必須ではない）
//	 * @param select2 選択2（必須ではない）
//	 * @param mav データ and Viewモデル
//	 * @return　テンプレート名
//	 */
//	@RequestMapping(value="/",method=RequestMethod.POST)
//	public ModelAndView send(
//			@RequestParam("text1")String str,
//			@RequestParam(value="check1",required=false)boolean check1,
//			@RequestParam(value="radio1",required=false)String radio1,
//			@RequestParam(value="select1",required=false)String select1,
//			@RequestParam(value="select2",required=false)String[] select2,
//			ModelAndView mav){
//		String res="";
//		try{
//			res = "check : " + check1 +
//					"  radio : " + radio1 +
//					"  select : " + select1 +
//					"\nselect2:";
//		}catch(NullPointerException e){}
//		try{
//			res += select2[0];
//			for(int i=1;i<select2.length;i++){
//				res += ", " + select2[i];
//			}
//		}catch(NullPointerException e){
//			res += "null";
//		}
//
//		mav.addObject("msg",res);
//		mav.setViewName("index");
//		return mav;
//	}

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

/**
 * JSONデータ
 */
class DataObject {
	private int id;
	private String name;
	private String value;

	public DataObject(int id, String name, String value){
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	public int getId(){ return id; }
	public void setId(int id){ this.id = id; }
	public String getName(){ return name; }
	public void setName(String name){ this.name = name; }
	public String getValue(){ return value; }
	public void setValue(String value){ this.value = value; }
}
