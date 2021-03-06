package org.rhpj.domain.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

// TODO 名前付きバインド変数
@Component
public class JdbcRoomNamedDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public String findRoomNameById(String roomId) {
		String sql = "SELECT room_name FROM TEST.room WHERE room_id = :roomId";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("roomId", roomId);
		return namedParameterJdbcTemplate.queryForObject(sql, params, String.class);
	}
}
