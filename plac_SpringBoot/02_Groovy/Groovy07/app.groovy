/**
 * クラス定義
 */
// Groovyに追加されているライブラリの利用を宣言
@Grab("thymeleaf-spring4")
@Controller
class App {
	/**
	 * 初回アクセス
	 */
	@RequestMapping(value="/" ,method=RequestMethod.GET) 
	@ResponseBody
	def home(ModelAndView mav){
		mav.setViewName("home")
		mav.addObject("msg","please write your name...")
		mav
	}
	/**
	 * フォーム送信
	 */
	@RequestMapping(value="/send" ,method=RequestMethod.POST) 
	@ResponseBody
	def send(@RequestParam("text1")String str,ModelAndView mav){
		mav.setViewName("home")
		mav.addObject("msg","Hello, " + str + "!!")
		mav.addObject("value",str)
		mav
	}
}