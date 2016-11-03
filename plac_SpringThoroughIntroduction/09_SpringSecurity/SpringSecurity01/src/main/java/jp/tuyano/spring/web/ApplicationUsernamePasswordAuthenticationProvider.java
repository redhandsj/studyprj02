package jp.tuyano.spring.web;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import jp.tuyano.spring.domain.model.User;

public class ApplicationUsernamePasswordAuthenticationProvider implements AuthenticationProvider {

	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// Identify user
		final String username = authentication.getName();
		final String password = authentication.getCredentials().toString();
		final User user = new User();

		user.setUser_name(username);
		user.setPassword(password);
		// Create authentication token
		// ※認証されたユーザにUSERロールを付与する。
		return new UsernamePasswordAuthenticationToken(user, authentication.getCredentials(), 
				Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
	}

	public boolean supports(Class<?> authentication) {
		// ※このプロバイダーが提供する型の指定。ユーザ情報でfalseが返ると認証エラーになる。なにに使うか分かっていない(´,,・ω・,,`){
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}
}
