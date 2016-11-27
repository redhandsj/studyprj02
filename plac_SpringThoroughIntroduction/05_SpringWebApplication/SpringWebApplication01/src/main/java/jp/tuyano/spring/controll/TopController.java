package jp.tuyano.spring.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.tuyano.spring.form.ProductForm;
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
		form.setRemark("");
		form.setSize("M");
		
		List<ProductForm> products = new ArrayList<ProductForm>();
		products.add(new ProductForm("lemon", 100, 10));
		products.add(new ProductForm("apple", 500, 20));
		products.add(new ProductForm("potato", 200, 0));
		products.add(new ProductForm("orange", 777, 30));
		products.add(new ProductForm("berry", 398, 0));
		model.addAttribute("products", products);

//		ProductForm product = new ProductForm("lemon", 100, 10);
//		model.addAttribute("productForm", product);
		
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
