package jp.tuyano.spring.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.context.MessageSource;


@RunWith(MockitoJUnitRunner.class) 
public class MessageServiceTest {
	
	@InjectMocks
	MessageService service;
	
	@Mock
	MessageSource mockMessageSource;
	
	@Test
	public void testGetMessage() {
		MessageService service = new MessageService();
		String actualMessage = service.getMessage();
		assertThat(actualMessage, is("Hello!!"));
	}
	
	@Test
	public void testGetMessageByCode(){
		// MessageSourceモックの設定をする。ここでは、"greeting"というコードが指定された際に、"Hello!!"を返却
		doReturn("Hello!!").when(mockMessageSource).getMessage("greeting", null, Locale.getDefault());
		
		// テストを行う
		String actualMessage = service.getMessageByCode("greeting");
		assertThat(actualMessage, is("Hello!!"));
	}
	

}
