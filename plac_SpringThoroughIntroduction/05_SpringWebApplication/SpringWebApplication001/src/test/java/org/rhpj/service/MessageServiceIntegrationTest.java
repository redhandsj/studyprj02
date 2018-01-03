package org.rhpj.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.logout;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.rhpj.config.TestConfig;
import org.rhpj.config.WebSecurityConfig;
import org.rhpj.service2.TestTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {TestConfig.class, WebSecurityConfig.class})
@WebAppConfiguration
public class MessageServiceIntegrationTest {
	@Autowired
	WebApplicationContext context;

	MockMvc mockMvc;
	
	@Autowired
	TestTestService service;
	
	@Before
	public void setupMockMvc() {
		// ユーザー指定のDIコンテナと連携するモード
		//this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		// スタンドアロンモードのセットアップ
		//this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build(); 

		// Spring Securityのサーブレットフィルタを追加
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
				.apply(springSecurity())
				.build();
		
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

	//=======================================================================
	// コントローラのテスト
	//=======================================================================
	/**
	 * コントローラテスト
	 * @throws Exception
	 */
	@WithMockUser
	@Test
	public void testHome() throws Exception {
		 this.mockMvc.perform(get("/"));
		 		//.andExpect(status().isOk());
		 		//.andExpect(forwardedUrl("/WEB-INF/view/index.jsp"));
	}

	/**
	 * 認証テスト
	 * @throws Exception
	 */
	@Test
	public void testAuth() throws Exception {
		 // フォーム認証のテスト 
		 this.mockMvc.perform(formLogin().user("user").password("pass"))
		     .andExpect(status().isFound()).andExpect(redirectedUrl("/"))
		     .andExpect(authenticated().withRoles("USER"));
	}

	/**
	 * ログアウトテスト
	 * @throws Exception
	 */
	@WithMockUser(username = "admin", roles = "ADMIN")
	@Test
	public void testLogout() throws Exception {
		 // ログアウトのテスト 
		 this.mockMvc.perform(logout())
		     .andExpect(status().isFound())
		     .andExpect(redirectedUrl("/login?logout"))
		     .andExpect(unauthenticated()); 
	}

	@WithMockUser
	@Test
	public void testCreateAccount() throws Exception {
		this.mockMvc.perform(post("/accounts").with(csrf()))
		    .andExpect(status().isOk());
	}

	
	
}
