//@RestController
@Grab("thymeleaf-spring4")
@Controller
class App{
	@RequestMapping("/")
	@ResponseBody
	def home(ModelAndView mav){
		// list_02_01
		//"Hello!!";

		// list_02_02
		//def header = "<html><body>"
		//def footer = "</body></html>"
		//def content = "<h1>Hello!</h1><p>this is html content</p>"
		//header + content + footer
		
		// list_02_04
		//mav.setViewName("home")
		//mav

		// list_02_08
		mav.setViewName("home")
		mav.addObject("msg","\u3053\u3093\u306b\u3061\u308f\uff01")
		mav
	}
}