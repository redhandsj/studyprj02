/**
 * クラス定義
 */
@Grab("thymeleaf-spring4")
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