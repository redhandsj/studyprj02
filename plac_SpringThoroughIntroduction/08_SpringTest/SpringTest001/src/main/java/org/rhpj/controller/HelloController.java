package org.rhpj.controller;

import org.rhpj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	private TestService testService;
		
	@RequestMapping("/") 
	 public String index(){
//		// DAOクラスの動作確認
//		int maxCapacity = jdbcRoom.findMaxCapacity();
//		System.out.println(maxCapacity);
//		// 名前なしバインド
//		System.out.println("RoomName : " + jdbcRoom.findRoomNameById("C001001"));
//		// 名前付きバインド変数
//		System.out.println("name bind RoomName : " + jdbcRoomNamedDao.findRoomNameById("A001"));
//		// 名前付きバインド変数
//		Room r = jdbcRoom.getRoomById("A001");
//		System.out.println("jdbcRoom getRoomById : " + r.getRoomName());

		//---------+---------+---------+---------+---------+---------+---------+
//		testService.Print("ssss");
//		Room r = roomService.getRoom("A001");
//		System.out.println("roomName : " + r.getRoomName());
//		
		
		//System.out.println(testService.getMessageByCode("hoge"));
		
		
		return "index";
	}
	
}
