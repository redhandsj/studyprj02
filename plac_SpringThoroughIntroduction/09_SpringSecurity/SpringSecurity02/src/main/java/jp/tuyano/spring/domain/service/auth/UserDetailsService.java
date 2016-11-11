package jp.tuyano.spring.domain.service.auth;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.tuyano.spring.domain.model.auth.UserDetails;

public interface UserDetailsService {
	/**
	 * ユーザ名からUserDetailsを取得
	 * @param username ユーザ名
	 * @return 詳細情報
	 * @throws UsernameNotFoundException
	 */
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
