package org.rhpj.domain.dao;

import java.util.List;
import java.util.Map;

import org.rhpj.domain.entity.Equipment;
import org.rhpj.domain.entity.Room;
import org.rhpj.domain.extractor.RoomListResultSetExtractor;
import org.rhpj.domain.rowcallbackhandler.RoomRowCallbackHandler;
import org.rhpj.domain.rowmapper.RoomRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 * （JDBC）DAOの基本機能
 * @author redhandsj
 *
 */
@Component
public class JdbcRoomDao {
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	 //======================================================================
	 // RowCallbackHandler
	 //======================================================================
	 public void reportRoom() { 
		 String sql = "SELECT room_id, room_name, capacity FROM TEST.room";
		 RoomRowCallbackHandler handler = new RoomRowCallbackHandler();
		 jdbcTemplate.query(sql, handler);
	 }
	 
	 //======================================================================
	 // ResultSetExtractor
	 //======================================================================
	 public List<Room> getAllRoomWithEquipment() { 
		 String sql = "SELECT r.room_id, r.room_name, r.capacity," + 
				 " e.equipment_id, e.equipment_name, e.equipment_count," + 
				 " e.equipment_remarks FROM TEST.room r LEFT JOIN TEST.equipment e" +
				 " ON r.room_id = e.room_id";
		 RoomListResultSetExtractor extractor = new RoomListResultSetExtractor();
		 return jdbcTemplate.query(sql, extractor); 
	 }
	 
	 public Room getRoomWithEquipmentById(String roomId) {
		 String sql = "SELECT r.room_id, r.room_name, r.capacity," + 
				 " e.equipment_id, e.equipment_name, e.equipment_count," +
				 " e.equipment_remarks FROM TEST.room r LEFT JOIN TEST.equipment e" +
				 " ON r.room_id = e.room_id WHERE r.room_id = ?";
		 RoomListResultSetExtractor extractor = new RoomListResultSetExtractor();
		 List<Room> roomList = jdbcTemplate.query(sql, extractor, roomId);
		 return roomList.get(0); 
	 }
	 
	 //======================================================================
	 // ROW MAPPER
	 //======================================================================
	 /**
	  * バインド変数を利用したSQL
	  * @param roomId
	  * @return
	  */
	 public Room findRoomRowNameById(String roomId) {
		 String sql = "SELECT room_name FROM TEST.room WHERE room_id = ?";
		 RoomRowMapper rowMapper = new RoomRowMapper();
		 return jdbcTemplate.queryForObject(sql, rowMapper, roomId);
	 }
	 
	 //======================================================================
	 // INSERT → updateを使用
	 //======================================================================
	 public int insertRoom(Room room) {
		 String sql = "INSERT INTO TEST.room(room_id, room_name, capacity) VALUES(?, ?, ?) ";
		 return jdbcTemplate.update(sql, room.getRoomId(), room.getRoomName(), room.getCapacity());
	 }
	 public int insertEquipment(Equipment eq) {
		 String sql = "INSERT INTO TEST.equipment(equipment_id, room_id, equipment_name, equipment_count, equipment_remarks) VALUES(?, ?, ?, ?, ?) ";
		 return jdbcTemplate.update(sql, 
				 eq.getEquipmentId(), eq.getRoomId(), eq.getEquipmentName(), eq.getEquipmentCount(), eq.getEquipmentRemarks());
	 }

	 //======================================================================
	 // UPDATE → updateを使用
	 //======================================================================
	 public int updateRoomById(Room room) {
		 String sql = "UPDATE TEST.room SET room_name=?, capacity=? WHERE room_id=? ";
		 return jdbcTemplate.update(sql, room.getRoomName(), room.getCapacity(), room.getRoomId());
	 }
	 
	 //======================================================================
	 // UPDATE → updateを使用
	 //======================================================================
	 public int deleteRoomById(String roomId) {
		 String sql = "DELETE FROM TEST.room WHERE room_id=? ";
		 return jdbcTemplate.update(sql, roomId);
	 }
	 
	 //======================================================================
	 // SELECT
	 //======================================================================
	 /**
	  * DAOの実装例
	  * @return
	  */
	 public int findMaxCapacity() {
		 String sql = "SELECT MAX(capacity) FROM TEST.room";
		 return jdbcTemplate.queryForObject(sql, Integer.class); 
	 }
	 
	 /**
	  * バインド変数を利用したSQL
	  * @param roomId
	  * @return
	  */
	 public String findRoomNameById(String roomId) {
		 String sql = "SELECT room_name FROM TEST.room WHERE room_id = ?";
		 return jdbcTemplate.queryForObject(sql, String.class, roomId);
	 }

	 /**
	  * 
	  * @param roomId
	  * @return
	  */
	 public Room getRoomById(String roomId) {
		 String sql = "SELECT room_id, room_name, capacity FROM TEST.room WHERE room_id = ?";
		 // SQL実行
		 Map<String, Object> result = jdbcTemplate.queryForMap(sql, roomId); 
		 Room room = new Room();
		 room.setRoomId((String) result.get("room_id"));
		 room.setRoomName((String) result.get("room_name"));
		 room.setCapacity((Integer) result.get("capacity"));
		 return room;	 
	 }
	 
	 /**
	  * 
	  * @return
	  */
	 public List<Room> getAllRoom() {
		 String sql = "SELECT room_id, room_name, capacity FROM TEST.room";
		 RoomRowMapper rowMapper = new RoomRowMapper();
		 return jdbcTemplate.query(sql, rowMapper);
//		 List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
//		 List<Room> roomList = new ArrayList<Room>();
//		 for(Map<String, Object> result: resultList) {
//			 Room room = new Room();
//			 room.setRoomId((String) result.get("room_id"));
//			 room.setRoomName((String) result.get("room_name"));
//			 room.setCapacity((Integer) result.get("capacity"));
//			 roomList.add(room);
//		 }
//		 return roomList; 
	 }

	 public Room getRoomUseBeanPropertyById(String roomId) {
		 String sql = "SELECT room_id, room_name, capacity FROM room WHERE room_id = ?";
		 RowMapper<Room> rowMapper = new BeanPropertyRowMapper<Room>(Room.class); 
		 return jdbcTemplate.queryForObject(sql, rowMapper, roomId);
	 }

	public Room getRoomForUpdate(String roomId) {
		// TODO Auto-generated method stub
		return null;
	}
                                 	 
}
