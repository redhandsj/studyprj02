package org.rhpj.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.rhpj.form.AccountForm;
import org.rhpj.form.CardForm;
import org.rhpj.form.WelcomeForm;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("welcome")
//@SessionAttributes(types = WelcomeForm.class)
public class WelcomeController {
	
//	@ModelAttribute
//	public WelcomeForm setUpForm() {
//		return new WelcomeForm();
//	}

//	@Bean
//	public Map<String, String> hobbyCodeList() {
//		Map<String, String> map = new LinkedHashMap<>();
//		map.put("sport", "スポーツ");
//		map.put("music", "音楽");
//		return Collections.unmodifiableMap(map); 
//	}

	//=======================================================================
	// セレクトボックス用
	//=======================================================================
	@Bean
	public Map<String, String> prefectureCodeList() {
		Map<String, String> map = new LinkedHashMap<>();
		 map.put("11", "埼玉");
         map.put("12", "千葉");
         return Collections.unmodifiableMap(map);
	}

	@RequestMapping(path  = {"/{id}"}, method = RequestMethod.GET)
	public String home(@PathVariable String id, 
//			 @CookieValue("example.springbook.cartId") String cartId,
//			 @RequestHeader(name = "X-Track-Id", required = false) String trackingId,
//			 @RequestParam Integer page,
			 Model model, RedirectAttributes redirectAttributes) {
		//model.addAttribute("now", new Date());
		//return "welcome/home";
		// ↓リダイレクト時のURLは「/welcome/menu?accountId=AAAAA」といった形式
//		redirectAttributes.addAttribute("accountId", "AAAAAA");

		// ↓パス変数の指定 
//		redirectAttributes.addAttribute("accountId", "AAAAAA");
//		return "redirect:/welcome/menu/{accountId}";
		WelcomeForm welcomeForm = new WelcomeForm();
		welcomeForm.setName("Name");
		model.addAttribute(welcomeForm);

//		redirectAttributes.addFlashAttribute("accountId", "AAAAAA");
		redirectAttributes.addAttribute("accountId", "AAAAAA");
		return "redirect:redirect_menu";  // リダイレクト先のリクエストパスを指定
//		return "forward:forward_menu";  // 転送先のリクエストパスを指定
	}
	//=======================================================================
	// リダイレクト
	//=======================================================================
	@RequestMapping(path  = {"/redirect_menu"}, method = RequestMethod.GET)
	public String menu(Model model) {
		return "welcome/redirect_menu";
	}
	//=======================================================================
	// フォワード
	//=======================================================================
	@RequestMapping(path  = {"/forward_menu"}, method = RequestMethod.GET)
	public String menu2(Model model) {
		return "welcome/forward_menu";
	}

//	public String search(
//		@DateTimeFormat(pattern = "yyyyMMdd") @RequestParam targetDate, 
//		Model model) { 
//		return null;
//	}
	
	//=======================================================================
	// フォーム作成チェック
	//=======================================================================
	/**
	 * 遷移先
	 * @param form
	 * @return
	 */
	@RequestMapping(path = "create")
	public String form(Model model) {
		WelcomeForm welcomeForm = new WelcomeForm();
		welcomeForm.setName("Name");
		welcomeForm.setEmail("Email");
		welcomeForm.setTel("Tel");
		welcomeForm.setDateOfBirth(new Date());
		welcomeForm.setAccount(new AccountForm());
		welcomeForm.getAccount().setName("AccountName");
		welcomeForm.getAccount().setEmail("AccountEmail");
		
		List<CardForm> clist = new ArrayList<CardForm>();
		CardForm c1 = new CardForm();
		CardForm c2 = new CardForm();
		c1.setNo("c1");
		c2.setNo("c2");
		clist.add(c1);
		clist.add(c2);
		welcomeForm.setCardList(clist);
		
		// ModelのAPIを利用
		// Modelにオブジェクトを追加する際に属性名を省略した場合は、クラス名をJavaBeansのプロ パティの命名規約に従って変換した文字列が属性名になります。たとえば、追加したオブジェク トのクラス名がcom.myapp.Productの場合はproductが属性名
		// 属性名の生成処理は、org.springframework.core.ConventionsクラスのgetVariableName( Object)メソッドが使われています
		model.addAttribute(welcomeForm);

		// 単体での引き渡し
		model.addAttribute("accountId", "AAAAAA");

		return "welcome/home";
	}

	//=======================================================================
	// バリデーションチェック
	//=======================================================================	
	/**
	 * 
	 * @param form
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(params = "kakunin")
	public String confirm(@Validated WelcomeForm form, 
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "welcome/home";
		}
		return "welcome/home";
	}	
	
	/**
	 * 
	 * @param form
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, params = {"confirm", "type=1"}) 
	public String confirmForFreeAccount( 
			WelcomeForm form, 
			BindingResult result, Model model) { 
		if (result.hasErrors()) {
			return "welcome/home";
		}
		return "welcome/home";
	}

	@RequestMapping(method = RequestMethod.POST, params = {"confirm", "type=2"}) 
	public String confirmForPayAccount(
			WelcomeForm form, 
			BindingResult result, Model model) { 
		if (result.hasErrors()) {
			return "welcome/home";
		}
		return "welcome/home";
	}

	//=======================================================================
	// フラッシュスコープの例
	//=======================================================================
//	/**
//	 * 遷移元
//	 * @param form
//	 * @param result
//	 * @param redirectAttributes
//	 * @return
//	 */
//	@RequestMapping(path = "create", method = RequestMethod.POST) 
//	public String create(
//			@Validated EchoForm form,
//			BindingResult result,
//			RedirectAttributes redirectAttributes) {
//		// フラッシュスコープにフォームを登録
//		redirectAttributes.addFlashAttribute(form);
//		return "redirect:/account/create?complete";
//	}
//	/**
//	 * 遷移先
//	 * @param form
//	 * @return
//	 */
//	@RequestMapping(path = "create", method = RequestMethod.GET, params = "complete")
//	public String createComplete(EchoForm form) {
//		return "account/complete";
//	}

	//=======================================================================
	// 
	//=======================================================================
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		//binder.addCustomFormatter(new DateFormatter("yyyyMMdd"));
	}
//	/**
//	 * 
//	 * @param binder
//	 */
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		// addCustomFormatterメソッドの呼び出し例
////		binder.addCustomFormatter(new DateFormatter("yyyyMMdd"));		 
//
//		// registerCustomEditorメソッドの呼び出し例
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
//		dateFormat.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false)); 
//	}
	
	
}
