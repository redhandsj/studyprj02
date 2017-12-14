package jp.tuyano.spring.controll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.tuyano.spring.domain.model.Room;
import jp.tuyano.spring.domain.repository.MyPersonDataDaoRepository;
import jp.tuyano.spring.domain.repository.RoomRepository;

@Controller
public class TopController {

	@Autowired
	MyPersonDataDaoRepository repository;
	@Autowired
	RoomRepository roomRepository;

	@RequestMapping("/web")
    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Room> rooms = roomRepository.findAll();
		request.setAttribute("room", rooms);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

