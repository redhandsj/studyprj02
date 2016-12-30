package jp.tuyano.spring.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.RoomRepository;

@Controller
public class TopController {

	@Autowired
	RoomRepository roomRepository;

	@RequestMapping("/web")
	public String index(Model model) {
		List<Room> rooms = roomRepository.findAll();
		model.addAttribute("rooms", rooms);
		return "index";
    }
}

