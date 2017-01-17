package jp.tuyano.spring.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.RoomRepository;
import jp.tuyano.spring.form.SessionScopeForm;
import jp.tuyano.spring.form.TopForm;

@Controller
@SessionAttributes(types = TopForm.class)
public class TopController {

	@Autowired
	RoomRepository roomRepository;

	@Autowired
	SessionScopeForm sessionScopeForm;

	@RequestMapping("/web")
	public String index(@Validated TopForm form, Model model) {
		roomRepository.saveAndFlush(new Room("新しい部屋",100));
		// テーブルの中身表示
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		sessionScopeForm.setId("aaa");
		model.addAttribute("form", sessionScopeForm);
		//form.setId("web");
		return "index";
	}
	
	@RequestMapping(path = "/web2", method = RequestMethod.POST)
	public String index2(@Validated TopForm form, Model model) {
		// テーブルの中身表示
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		form.setId("web2");
		sessionScopeForm.setId("Session2");
		return "index2";
	}

	@ModelAttribute("topForm")
	public TopForm setUpTopForm(){
		return new TopForm();    
	}

}
