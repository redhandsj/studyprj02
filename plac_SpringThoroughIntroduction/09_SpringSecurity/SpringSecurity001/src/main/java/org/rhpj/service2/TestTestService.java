package org.rhpj.service2;

import java.util.List;
import java.util.Locale;

import org.rhpj.domain.dao.JdbcRoomDao;
import org.rhpj.domain.dao.JdbcRoomNamedDao;
import org.rhpj.domain.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class TestTestService {
	@SuppressWarnings("unused")
	@Autowired
	private JdbcRoomDao jdbcRoom;
	
	@SuppressWarnings("unused")
	@Autowired
	private JdbcRoomNamedDao jdbcRoomNamedDao; 

	@Autowired
	MessageSource messageSource;
	/**
	 * コードメッセージ
	 * @param code
	 * @return
	 */
	public String getMessageByCode(String code) {
		return messageSource.getMessage(code, null, Locale.getDefault());		
	}
	/**
	 * 全部屋表示
	 */
	public void allRoomPrint() {
		List<Room> list = jdbcRoom.getAllRoom();
		for(Room rr: list) {
			System.out.println("roomName : " + rr.getRoomName());
		}       
	}

}
