package app;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

// 共通的な例外処理を実装するためために、@ControllerAdviceを付与
@ControllerAdvice
public class GlobalExceptionHandler {

	// ハンドリング対象の例外クラスの指定
	@ExceptionHandler
	// クライアントへ応答するステータスコードを指定する。500（Internal Server Error）を指定
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleException(Exception e) {
		// エラー処理として遷移先のView名を返却
		return "errors/systemError"; 
	}
}
