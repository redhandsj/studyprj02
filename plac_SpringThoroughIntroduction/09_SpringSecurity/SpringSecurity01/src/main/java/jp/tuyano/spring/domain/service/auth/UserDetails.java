package jp.tuyano.spring.domain.service.auth;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public interface UserDetails extends Serializable {
	/**
	 * ユーザ名取得
	 * @return ユーザ名
	 */
	String getUsername();
	/**
	 * パスワード取得
	 * @return パスワード
	 */
	String getPassword();
	
	/**
	 * ユーザが有効判定
	 * @return 有効フラグ
	 * 	<ul>
	 * 	<li> true : 有効
	 * 	<li> false: 無効
	 * 	</ul>
	 */
	boolean isEnabled();

	/**
	 * アカウントロック状態判定
	 * @return ロック状態
	 * 	<ul>
	 * 	<li> true : ロックされてない
	 * 	<li> false: ロックされている
	 * 	</ul>
	 */
	boolean isAccountNonLocked();
	
	/**
	 * アカウント有効期限状態判定
	 * @return 有効期限状態
	 * 	<ul>
	 * 	<li> true : 有効期限内
	 * 	<li> false: 有効期限切れ
	 * 	</ul>
	 */
	boolean isAccountNonExpired();
	
	/**
	 * 資格情報の有効期限状態判定
	 * @return 資格情報の有効期限状態
	 * 	<ul>
	 * 	<li> true : 有効期限内
	 * 	<li> false: 有効期限切れ
	 * 	</ul>
	 */
	boolean isCredentialsNonExpired();
	
	/**
	 * ユーザに与えられている権限リスト取得
	 * @return ユーザに与えられている権限リスト
	 */
	Collection<? extends GrantedAuthority> getAuthorities();
	
}
