package org.rhpj.domain.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.rhpj.domain.entity.Equipment;
import org.rhpj.domain.entity.Room;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class RoomListResultSetExtractor  implements ResultSetExtractor<List<Room>> {

	/**
	 * 
	 */
	@Override
	public List<Room> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// 挿入された順にキーを管理
		Map<String, Room> map = new LinkedHashMap<String, Room>();
		Room room = null;
		while(rs.next()) { 
			String roomId = rs.getString("room_id");
			room = map.get(roomId);
			if(room == null) {
				room = new Room();
				room.setRoomId(roomId);
				room.setRoomName(rs.getString("room_name"));
				room.setCapacity(rs.getInt("capacity"));
				map.put(roomId, room);
				//room.setEquipmentList(new ArrayList<Equipment>());
			}
			String equipmentId = rs.getString("equipment_id"); 
			if(equipmentId != null) {
				Equipment equipment = new Equipment();
				equipment.setEquipmentId(equipmentId);
				equipment.setRoomId(roomId);
				equipment.setEquipmentName(rs.getString("equipment_name"));
				equipment.setEquipmentCount(rs.getInt("equipment_count"));
				equipment.setEquipmentRemarks(rs.getString("equipment_remarks"));
 			}
		}

		if(map.size() == 0) { 
			throw new EmptyResultDataAccessException(1);
                     		}
		return new ArrayList<Room>(map.values()); 
	 }
}
