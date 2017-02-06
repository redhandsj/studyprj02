/**
 * \u30af\u30e9\u30b9\u5b9a\u7fa9
 */
// Groovy\u306b\u8ffd\u52a0\u3055\u308c\u3066\u3044\u308b\u30e9\u30a4\u30d6\u30e9\u30ea\u306e\u5229\u7528\u3092\u5ba3\u8a00
@Grab("thymeleaf-spring4")
@Controller
class App {
	/**
	 * \u30e1\u30bd\u30c3\u30c9\u5b9a\u7fa9
	 */
	@RequestMapping("/")
	@ResponseBody
	def home(ModelAndView mav){
		mav.setViewName("home");
		//mav.addObject("msg","Hello! this is sample page.")
		mav.addObject("msg","\u3053\u3093\u306b\u3061\u308f")
		mav;
	}
}
