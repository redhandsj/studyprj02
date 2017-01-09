package jp.tuyano.spring.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.RoomRepository;
import jp.tuyano.spring.form.TopForm;

@Controller
@SessionAttributes(types = TopForm.class)
public class TopController {

	@Autowired
	RoomRepository roomRepository;

	@RequestMapping("/web")
	//public String index(@ModelAttribute("topForm") TopForm form, Model model) {
	public String index(Model model) {
		roomRepository.saveAndFlush(new Room("新しい部屋",100));
		// テーブルの中身表示
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		//form.setId("web");
		return "index";
	}
	
	@RequestMapping(path = "/web2", method = RequestMethod.POST)
	public String index2(@ModelAttribute("topForm") TopForm form, Model model) {
		// テーブルの中身表示
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		return "index2";
    }

	
	
}

