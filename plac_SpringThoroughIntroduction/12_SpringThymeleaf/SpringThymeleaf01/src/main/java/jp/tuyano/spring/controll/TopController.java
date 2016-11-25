package jp.tuyano.spring.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.tuyano.spring.form.echoForm;

@Controller
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
	
	/**
	 * トップ画面
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = { RequestMethod.GET})
    public String index(@ModelAttribute("echoForm") echoForm form, Model model) {
		form.setText("本システムを利用するにあたり、まず<b>ご利用規約の同意</b>を行ってください。");
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
    public String output(@ModelAttribute("echoForm") echoForm form, Model model) {
		return "/echo/output";
	}

}

