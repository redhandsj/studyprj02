package org.rhpj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.rhpj.config.TestConfig;
import org.rhpj.domain.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
public class MybatisTest {

	@Autowired
	private RoomMapper roomMapper;
	
	@Test
	@Sql("classpath:sql/insert-test-data.sql")
	public void testMybatis() {
//		long cnt = roomMapper.countByExample(null);
//		int cnt = roomMapper.countAll();
//		int cnt = roomMapper.countByRoomId("A001");

		return;		
	}	
}
