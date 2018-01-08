package org.rhpj.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler
	 @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	 public String handleException(Exception e) {
		 // 任意のエラー処理を実装する
		 return "error/systemError"; 
	 }
	
}
