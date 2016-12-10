package jp.tuyano.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 共通エラーメソッド
	 * @param e
	 * @return
	 */
	@ExceptionHandler
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleException(Exception e) {
		System.out.println("★★★★★★★★★★★★");
		System.out.println(e.getMessage());
		return "error/systemError";
	}

}
