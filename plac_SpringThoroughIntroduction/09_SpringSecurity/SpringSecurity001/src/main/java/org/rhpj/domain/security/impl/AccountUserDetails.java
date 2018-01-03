package org.rhpj.domain.security.impl;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class AccountUserDetails extends User {

//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private final Account account;
//
////	private final Collection<GrantedAuthority> authorities;
////
//	 public AccountUserDetails(
//			 Account account, 
//			 Collection<GrantedAuthority> authorities
//			 ) { 
//		 super(account.getUsername(), account.getPassword(), account.isEnabled(), 
//				 true, true, true, authorities);
//		 this.account = account; 
//	 }
//
//	 public AccountUserDetails(
//			 Account account, 
//			 boolean accountNonExpired,
//			 boolean credentialsNonExpired,
//			 boolean accountNonLocked,
//			 Collection<GrantedAuthority> authorities
//			 ) { 
//		 super(account.getUsername(), account.getPassword(), account.isEnabled(), 
//				 true, true, true, authorities);
//		 this.account = account; 
//	 }

//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public AccountUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
