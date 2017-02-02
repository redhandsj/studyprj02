//@RestController
@Grab("thymeleaf-spring4")
@Controller
class App{
	@RequestMapping(value="/", method=RequestMethod.GET)
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
		mav.addObject("msg","please write your name...")
		mav
	}

	@RequestMapping(value="/send", method=RequestMethod.POST)
	@ResponseBody
	def send(@RequestParam("text1")String str, ModelAndView mav){
		mav.setViewName("home")
		mav.addObject("msg","Hello, " + str + "!!")
		mav.addObject("value", str)
		mav
	}	
}
