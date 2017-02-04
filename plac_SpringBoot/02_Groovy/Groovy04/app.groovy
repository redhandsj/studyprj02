/**
 * クラス定義
 */
// Groovyに追加されているライブラリの利用を宣言
@Controller
class App {
	/**
	 * メソッド定義
	 */
	@RequestMapping("/")
	@ResponseBody
	def home(ModelAndView mav){
		mav.setViewName("home");
		mav;
	}
}