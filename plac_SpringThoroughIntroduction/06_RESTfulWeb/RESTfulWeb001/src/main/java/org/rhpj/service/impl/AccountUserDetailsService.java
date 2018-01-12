package org.rhpj.service.impl;

import org.rhpj.domain.security.impl.AccountUserDetails;
import org.rhpj.service.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountUserDetailsService  implements UserDetailsService {

	@Override
	public AccountUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
//	 @Autowired
//	 AccountRepository accountRepository;

//	@Override
//	public AccountUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Optional<Account> account = Optional.ofNullable(accountRepository.findById(username)).orElseThrow(() -> new UsernameNotFoundException("user not found."));          
//		return new AccountUserDetails(account.get(), getAuthorities(account)); 
//	}
//
//	private Collection<GrantedAuthority> getAuthorities(Optional<Account> account) { 
////		 if (account.isAdmin()) {
////			 return AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
////		 } else {
//			 return AuthorityUtils.createAuthorityList("ROLE_USER");
////		 }
//	}
	

}
