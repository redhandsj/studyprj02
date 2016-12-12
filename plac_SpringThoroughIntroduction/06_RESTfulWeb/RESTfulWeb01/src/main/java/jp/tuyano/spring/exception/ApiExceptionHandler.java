package jp.tuyano.spring.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jp.tuyano.spring.domain.resource.ApiError;

/**
 * 例外ハンドラクラス<br>
 * <ul>
 * <li>作成するだけで、フレームワーク処理で発生する例外をすべてハンドリングすることができます。
 * </ul>
 */
@ControllerAdvice
public class ApiExceptionHandler  extends ResponseEntityExceptionHandler {

//	@SuppressWarnings("unchecked")
//	private final Map<Class<? extends Exception>, String> messageMappings =
//			Collections.unmodifiableMap(new LinkedHashMap() {{
//				put(HttpMessageNotReadableException.class,"Request body is invalid");
//			}});
//	
//	/**
//	 * 
//	 * @param ex
//	 * @param defaultMessage
//	 * @return
//	 */
//	private String resolveMessage(Exception ex, String defaultMessage) {
//		return messageMappings.entrySet().stream()
//				.filter(entry -> entry.getKey().isAssignableFrom(ex.getClass())).findFirst()
//				.map(Map.Entry::getValue).orElse(defaultMessage);
//	} 
	
	/**
	 * エラー情報をリソースに格納
	 * @param ex エラー情報
	 * @return リソース
	 */
	private ApiError createApiError(Exception ex) {
		ApiError apiError = new ApiError();
		//apiError.setMessage(this.resolveMessage(ex, ex.getMessage())); // メッセージの解決方法は見直しましょう
		apiError.setMessage(ex.getMessage()); // メッセージの解決方法は見直しましょう
		apiError.setDocumentationUrl("http://example.com/api/errors");
		return apiError;
	} 

	/**
	 * エラー情報をレスポンスボディに出力するための実装
	 */
	@Override
	protected ResponseEntity<Object> handleExceptionInternal(
			Exception ex, Object body, HttpHeaders headers,HttpStatus status, WebRequest request) {
	
		ApiError apiError = this.createApiError(ex);
		return super.handleExceptionInternal(ex, apiError, headers, status, request);
	}
	
	
}
