package jp.tuyano.spring.controll;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.tuyano.spring.form.AccountCreateForm;
import jp.tuyano.spring.form.ProductForm;
import jp.tuyano.spring.form.echoForm;

@Controller
//@SessionAttributes(types = echoForm.class)
public class TopController {

//	@Autowired
//	MyPersonDataDaoRepository repository;
//	@Autowired
//	RoomRepository roomRepository;
//
//	@RequestMapping("/web")
//    public String index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////		List<Room> rooms = roomRepository.findAll();
////		request.setAttribute("room", rooms);
////		request.getRequestDispatcher("/index.jsp").forward(request, response);
//        return "/index";
//    }

//	/**
//	 * model.addAttribute(new AccountCreateForm());でなければこれでもよい。
//	 * @return
//	 */
//	@ModelAttribute
//	public AccountCreateForm setUpForm() {
//		return new AccountCreateForm();
//	}
	
//	/**
//	 * 
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping("create")
//	public String form(Model model) {
//		model.addAttribute(new AccountCreateForm());
//		return "account/createForm";
//	}


	/**
	 *「未入力は許容するが、入力された場合は6文字以上であること」という要件を満たすための処理
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// コンストラクタ引数にtrue（空文字をnullへ変換する）を指定してStringTrimmerEditorのインスタンスを作成
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	/**
	 * トップ画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = { RequestMethod.GET})
    public String index(@ModelAttribute("echoForm") echoForm form, Model model, RedirectAttributes attr) {
		form.setText("本システムを利用するにあたり、まず<b>ご利用規約の同意</b>を行ってください。");
		form.setRemark("");
		form.setSize("M");

		List<ProductForm> products = new ArrayList<ProductForm>();
		products.add(new ProductForm("lemon", 100, 10));
		products.add(new ProductForm("apple", 500, 20));
		products.add(new ProductForm("potato", 200, 0));
		products.add(new ProductForm("orange", 777, 30));
		products.add(new ProductForm("berry", 398, 0));
		model.addAttribute("products", products);

		// 初期化して渡す
		model.addAttribute(new AccountCreateForm("name","tel",new Date(),"email@email.com"));

		//		ProductForm product = new ProductForm("lemon", 100, 10);
//		model.addAttribute("productForm", product);

		// フラッシュスコープ：遷移先画面に渡したい値を追加
		//attr.addFlashAttribute("message", "メールを送信しました。");  

		
		
		return "/index";
    }

	/**
	 * インプット画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/echo/input", method = { RequestMethod.GET})
    public String input(@ModelAttribute("echoForm") echoForm form, Model model) {
		return "/echo/input";
    }

	/**
	 * アウトプット画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/echo/output", method = { RequestMethod.POST })
    public String output(@ModelAttribute("echoForm") @Validated echoForm form, BindingResult result, Model model) {
		// 入力チェックエラー
		if (result.hasErrors()) {
			// エラーの場合は戻る
			 return "/echo/input";
		}
		return "/echo/output";
	}

}
