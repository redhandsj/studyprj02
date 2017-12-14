package jp.tuyano.spring.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource messageSource;
	
	/**
	 * メッセージ取得
	 * @param code 取得コード
	 * @return 取得メッセージ
	 */
	public String getMessageByCode(String code) {
		 return messageSource.getMessage(code, null, Locale.getDefault());
	}

	/**
	 * Hello
	 * @return "Hello"
	 */
	public String getMessage() {
		 return "Hello!!";
	}
}
