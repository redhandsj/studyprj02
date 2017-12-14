package jp.tuyano.spring.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class ApplicationUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		if (!request.getMethod().equals("POST")) {
			throw new AuthenticationServiceException("Authentication method not supported: " + request.getMethod());
		}

		// ユーザ名とパスワードを取得
		final String username = super.obtainUsername(request);
		final String password = super.obtainPassword(request);
		if (username == null || password == null) {
			// 揃ってない場合は、認証失敗
			throw new AuthenticationServiceException("Authentication info must be set");
		}

		// とりあえず認証チェック
		if (!username.equals("namihira") || !password.equals("namihira")) {
			// 認証失敗
			throw new AuthenticationServiceException("認証に失敗しました。");
		}
		// ユーザ名とパスワードから認証トークンを作成
		final UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(username, password);
		// 認証検証
		return this.getAuthenticationManager().authenticate(authToken);
	}
}
