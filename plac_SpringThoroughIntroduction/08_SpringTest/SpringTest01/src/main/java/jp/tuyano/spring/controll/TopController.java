package jp.tuyano.spring.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.tuyano.spring.domain.model.Kamoku;
import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.KamokuRepository;
import jp.tuyano.spring.domain.repository.RoomRepository;
import jp.tuyano.spring.domain.repository.YokinRepository;
import jp.tuyano.spring.form.SimpleInputForm;

@Controller
public class TopController {

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	KamokuRepository kamokuRepository;

	@Autowired
	YokinRepository yokinRepository;
	
	@ModelAttribute(value = "simpleInputForm")
	public SimpleInputForm newSimpleInputForm() {
	    return new SimpleInputForm();
	}
	
	@RequestMapping("/web")
	public String index(Model model) {
//		Room room = new Room("新しい部屋",100);
//		Room tmproom = roomRepository.save(room);
//		roomRepository.flush();

		
		// テーブルの中身表示
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		// テーブルの中身表示
		List<Kamoku> kamokus = kamokuRepository.findAll();
		model.addAttribute("kamokus", kamokus);

		
		return "index";
    }
	
	/**
	 * 
	 * @param model
	 * @param simpleInputForm
	 * @return
	 */
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(Model model,
			@ModelAttribute("simpleInputForm") SimpleInputForm simpleInputForm) {
//		yokinRepository.count();
		Kamoku kamoku = new Kamoku(simpleInputForm.getName());
		kamokuRepository.save(kamoku);
		kamokuRepository.flush();
		//return "index";
		return "forward:web";
	}
	
}

