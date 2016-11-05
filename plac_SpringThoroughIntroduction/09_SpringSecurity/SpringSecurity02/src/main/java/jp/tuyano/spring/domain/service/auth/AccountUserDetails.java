package jp.tuyano.spring.domain.service.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import jp.tuyano.spring.domain.model.User;

public class AccountUserDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	
	private final User user ;
	private final Collection<GrantedAuthority> authorities;

	/**
	 * コンストラクタ
	 * @param user ユーザ情報
	 * @param authorities 権限情報
	 */
	public AccountUserDetails(final User user, final Collection<GrantedAuthority> authorities){
		this.user = user;
		this.authorities = authorities;
		
	}

	public String getUsername(){
		return user.getUser_name();
	}

	public String getPassword(){
		return user.getPassword();
	}
	
//	public boolean isEnabled(){
//		return user.isEnabled();
//	}
	
	public Collection<GrantedAuthority> getAuthorities(){
		return authorities;
	}

	public boolean isAccountNonLocked(){
		return true;
	}
	
	public boolean isAccountNonExpired(){
		return true;
	}
	
	public boolean isCredentialsNonExpired(){
		return true;
	}
	
	public User getUser(){
		return user;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
