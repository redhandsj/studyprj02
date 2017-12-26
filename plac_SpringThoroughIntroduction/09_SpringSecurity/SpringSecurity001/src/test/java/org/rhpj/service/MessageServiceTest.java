package org.rhpj.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.MessageSource;

@RunWith(MockitoJUnitRunner.class)
public class MessageServiceTest {

	@InjectMocks
	TestService service;
	
	@Mock
	MessageSource mockMessageSource;
	
	@Test
	 public void testGetMessage() {
//		// 通常のJUnitでのテスト
//		TestService service = new TestService();
//		String actualMessage = service.getMessage();
//		assertThat(actualMessage, is("Hello!!"));

		// Mockを使ったテスト
		doReturn("Hello!!").when(mockMessageSource).getMessage("greeting", null, Locale.getDefault());
		String actualMessage = service.getMessageByCode("greeting"); 
		assertThat(actualMessage, is("Hello!!"));
	
	
	}
}
