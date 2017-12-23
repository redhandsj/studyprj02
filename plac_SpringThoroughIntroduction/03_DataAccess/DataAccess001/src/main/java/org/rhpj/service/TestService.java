package org.rhpj.service;

import java.util.List;

import org.apache.ibatis.javassist.NotFoundException;
import org.rhpj.domain.dao.JdbcRoomDao;
import org.rhpj.domain.dao.JdbcRoomNamedDao;
import org.rhpj.domain.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Autowired
	private JdbcRoomDao jdbcRoom;
	
	@SuppressWarnings("unused")
	@Autowired
	private JdbcRoomNamedDao jdbcRoomNamedDao; 

	public void Print(final String title) {
		//System.out.println("TEST.Print() : " + title);
//		Room room = new Room();
//		room.setRoomId("WWW00001");
//		room.setRoomName("NAME_NAME");
//		room.setCapacity(100);		
//		this.jdbcRoom.insertRoom(room);
//
//		this.allRoomWithEquipmentPrint();

		Room r = jdbcRoom.getRoomWithEquipmentById("A001");
		System.out.println(title + "roomName : " + r.getRoomName());
		
		jdbcRoom.reportRoom();
		
		
//		this.allRoomPrint(title);
	}

	/**
	 * 全部屋表示
	 */
	@SuppressWarnings("unused")
	private void allRoomPrint(final String title) {
		List<Room> list = jdbcRoom.getAllRoom();
		for(Room rr: list) {
			System.out.println(title + "roomName : " + rr.getRoomName());
		}       
	}

	/**
	 * 全部屋表示
	 */
	private void allRoomWithEquipmentPrint() {
//		List<Room> list = jdbcRoom.getAllRoomWithEquipment();
//		for(Room rr: jdbcRoom.getAllRoomWithEquipment()) {
//			System.out.println("-- roomName : " + rr.getRoomName());
//			for(Equipment e : rr.getEquipmentList()) {
//				System.out.println("equipmentName : " + e.getEquipmentName());				
//			}
//		}       
	}
	
	public Room getRoomForUpdate(String roomId) {
		Room room = null;
		try {
			room = jdbcRoom.getRoomForUpdate(roomId);
			
		}catch(DataRetrievalFailureException e) {
			try {
				throw new NotFoundException("roomId=" + roomId, e);
			} catch (NotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		}
		return room; 
	}
	
	

}
