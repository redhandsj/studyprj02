package org.rhpj.service;

import org.rhpj.domain.security.impl.AccountUserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {
	AccountUserDetails loadUserByUsername(String username) throws UsernameNotFoundException;	
}
