package jp.tuyano.spring.domain.service.auth;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
	/**
	 * ユーザ名からUserDetailsを取得
	 * @param username ユーザ名
	 * @return 詳細情報
	 * @throws UsernameNotFoundException
	 */
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
