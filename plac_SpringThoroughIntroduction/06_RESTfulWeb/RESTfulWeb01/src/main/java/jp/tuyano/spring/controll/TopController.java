package jp.tuyano.spring.controll;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.tuyano.spring.domain.resource.BookResource;
import jp.tuyano.spring.form.AccountCreateForm;
import jp.tuyano.spring.form.EchoForm;
import jp.tuyano.spring.form.ProductForm;

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

	@Autowired
	RestOperations restOperations;

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
    public String index(@ModelAttribute("echoForm") EchoForm form, Model model, RedirectAttributes attr) {
		form.setText("本システムを利用するにあたり、まず<b>ご利用規約の同意</b>を行ってください。");
		form.setRemark("");
		form.setSize("M");

		List<ProductForm> products = new ArrayList<ProductForm>();
		// 共通エラーメソッド確認要
		//List<ProductForm> products = null;
		products.add(new ProductForm("lemon", 100, 10));
		products.add(new ProductForm("apple", 500, 20));
		products.add(new ProductForm("potato", 200, 0));
		products.add(new ProductForm("orange", 777, 30));
		products.add(new ProductForm("berry", 398, 0));
		model.addAttribute("products", products);

		// 初期化して渡す
		model.addAttribute(new AccountCreateForm("name","tel",new Date(),"email@email.com"));

		// URIテンプレートを使用してREST APIを呼び出す実装例
		String bookId = "00000000-0000-0000-0000-000000000000";
		// RestTemplate（文字列）
		String resource1 = restOperations.getForObject(
				"http://localhost:8080/RESTfulWeb01/books/{bookId}",
				String.class,
				bookId);
		System.out.println(resource1);

		// RestTemplate（専用クラス）
		BookResource resource2 = restOperations.getForObject(
				"http://localhost:8080/RESTfulWeb01/books/00000000-0000-0000-0000-000000000000",
				 BookResource.class);
		System.out.println(resource2.getName());

		// 作成
		BookResource resource3 = new BookResource();
		resource3.setName("Spring徹底入門");
		resource3.setPublishedDate(LocalDate.of(2016,4,1));
		URI createdResourceUri = restOperations.postForLocation("http://localhost:8080/RESTfulWeb01/books/create", resource3);
		System.out.println(createdResourceUri);
		

		// 作成パターン２：リクエストヘッダーの設定
		BookResource resource4 = new BookResource();
		resource4.setName("Spring徹底入門２");
		resource4.setPublishedDate(LocalDate.of(2016,4,11));
		RequestEntity<BookResource> requestEntity = RequestEntity
				.post(URI.create("http://localhost:8080/RESTfulWeb01/books/create"))
				.contentType(MediaType.APPLICATION_JSON)
				.header("X-Track-Id", UUID.randomUUID().toString())
				.body(resource4);
		ResponseEntity<Void> responseEntity = restOperations.exchange(requestEntity, Void.class);

		
		// 作成パターン３：HTTPステータスとレスポンスヘッダーの取得
		BookResource resource5 = new BookResource();
		resource5.setName("Spring徹底入門２");
		resource5.setPublishedDate(LocalDate.of(2016,4,11));
		ResponseEntity<Void> responseEntity2 = restOperations.postForEntity(
				"http://localhost:8080/RESTfulWeb01/books/create",
				resource5,
				Void.class);
		HttpStatus httpStatus = responseEntity2.getStatusCode();
		HttpHeaders responseHeaders = responseEntity2.getHeaders();
		
		//		ProductForm product = new ProductForm("lemon", 100, 10);
//		model.addAttribute("productForm", product);

		// フラッシュスコープ：遷移先画面に渡したい値を追加
		//attr.addFlashAttribute("message", "メールを送信しました。");  

		
		
		return "/index";
    }
	/**
	 * 
	 * @return
	 */
	@ModelAttribute("setString") // ←メソッドの戻り値をModelに追加
	private String setString() {
		return "call setString method!!!!!!";
	}

	/*****************************************************************************************************************/
	/**
	 * テスト用画面 001
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/tests/test001", method = { RequestMethod.GET})
	public String test001(@ModelAttribute("echoForm") EchoForm form) {
		return "/tests/test001";
	}
	/**
	 * テスト用画面 002
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/tests/test002", method = { RequestMethod.GET})
	public String test002(@ModelAttribute("echoForm") EchoForm form) {
		//return "/tests/test002";
		// パラメーラが「003」なので、test003メソッドへ飛ぶ
		return "redirect:/tests/test?003";
	}
	/**
	 * テスト用画面 003
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/tests/test", method = { RequestMethod.GET}, params="003")
	public String test003(@ModelAttribute("echoForm") EchoForm form) {
		return "/tests/test003";
	}

	
	
	/*****************************************************************************************************************/
	/**
	 * インプット画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/echo/input", method = { RequestMethod.GET , RequestMethod.POST })
    public String input(@ModelAttribute("echoForm") EchoForm form) {
		return "/echo/input";
    }
	/*****************************************************************************************************************/
	/**
	 * アウトプット画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/echo/output", method = { RequestMethod.POST })
    public String output(@ModelAttribute("echoForm") @Validated EchoForm form, BindingResult result, RedirectAttributes redirectAttributes) {
		// 入力チェックエラー
		if (result.hasErrors()) {
			// エラーの場合は戻る
			// TODO リダイレクトの場合は、クライアントに一度戻るので、リクエスト情報が消える → エラー情報が表示されない
			// return "redirect:/echo/input";
			// TODO リダイレクトでリクエスト情報を渡すには以下のようにする
//			redirectAttributes.addAttribute("aaaaaaaaaa","aaaaaaaaaa"); 
//			return "redirect:/echo/input";
			// TODO リダイレクト先のURL内にパス変数を用意する。上記の例では、URL内の{accountId}の部分がパス変数
//			redirectAttributes.addAttribute("accountId", "aaaa");
//			 return "redirect:/account/{accountId}?createComplete"; 
			// TODO フォワードだが、フォワード先にはPOST指定する必要がある
			return "forward:/echo/input";
		}
		return "/echo/output";
	}

}
