package org.rhpj.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rhpj.config.TestConfig;
import org.rhpj.controller.HelloController;
import org.rhpj.service2.TestTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@WebAppConfiguration
public class MessageServiceIntegrationTest {
//	@Autowired
//	WebApplicationContext context;

	MockMvc mockMvc;
	
	@Autowired
	TestTestService service;
	
	@Before
	public void setupMockMvc() {
		// ユーザー指定のDIコンテナと連携するモード
		//this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		// スタンドアロンモードのセットアップ
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build(); 
		return;
	}
	
	@Test
	//@Transactional
	@Sql("classpath:sql/insert-test-data.sql")
	public void testGetMessageByCode() {
		service.allRoomPrint();
		String actualMessage = service.getMessageByCode("hoge");
		assertThat(actualMessage, is("Helllo!!!!!!!"));
	}

	/**
	 * コントローラテスト
	 * @throws Exception
	 */
	@Test
	public void testHome() throws Exception {
		 this.mockMvc.perform(get("/"))
		 		.andExpect(status().isOk());
		 		//.andExpect(forwardedUrl("/WEB-INF/view/index.jsp")); 
	}
	
}
