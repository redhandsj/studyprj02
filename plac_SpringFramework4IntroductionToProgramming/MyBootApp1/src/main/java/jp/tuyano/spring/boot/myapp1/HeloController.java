package jp.tuyano.spring.boot.myapp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {
//	/**
//	 * 「URL/」アクセス時の動作
//	 * @return レスポンス
//	 */
//	@RequestMapping("/")
//	public String index(){
//		return "index";
//	}

	/**
	 * リポジトリ
	 * <ul>
	 * <li> 自動で組み込まれる
	 * </ul>
	 */
	@Autowired
	MyMemoDataRepository repository;
	/**
	 * 「URL/」アクセス時の動作
	 * @param model アトリビュート
	 * @return レスポンス
	 */
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("msg", "this is Model attribute!");
		return "index";
	}

//	/**
//	 * フォームのpostに対応したメソッド
//	 * <ul>
//	 * <li> POSTの場合のみ「method」欄を明記する必要がある
//	 * </ul>
//	 * @param text1 フォーム入力値
//	 * @return レスポンス
//	 */
//	@RequestMapping(value="/post",method=RequestMethod.POST)
//	public ModelAndView postForm(@RequestParam("text1") String text1){
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("msg","you write '" + text1 + "'!!!");
//		return mv;
//	}

	/**
	 * (list_09_20) フォームのpostに対応したメソッド
	 * <ul>
	 * <li> 画面で入力されたデータを保存する
	 * </ul>
	 * @param title フォーム入力値
	 * @param content フォーム入力値
	 * @return レスポンス
	 */
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public ModelAndView postForm(@RequestParam("title") String title,@RequestParam("content") String content){
		// 画面入力値を取得
		MyMemoData memo = new MyMemoData(title,content);
		// 保存
		repository.saveAndFlush(memo);
		// 保存したデータを画面に表示
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg","add memo<br>" + memo);
		return model;
	}

	/**
	 * 「/memo」アクセス時のpost
	 * <ul>
	 * <li> 保存されているデータを全部画面に表示する
	 * </ul>
	 * @param model データ
	 * @return　レスポンス
	 */
	@RequestMapping("/memo")
	public String memo(Model model){
		List<MyMemoData> list = repository.findAll();
		String result = "<pre>";
		for(MyMemoData memo : list){
			result += memo.toString() + "\n";
		}
		result += "<pre>";
		model.addAttribute("msg",result);
		return "index";
	}

}
