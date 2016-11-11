package jp.tuyano.spring.domain.service.auth;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.tuyano.spring.domain.model.User;
import jp.tuyano.spring.domain.model.auth.AccountUserDetails;
import jp.tuyano.spring.domain.model.auth.UserDetails;
import jp.tuyano.spring.domain.repository.UserRepository;

@Service
public class AccountUserDetailsService implements UserDetailsService {
	@Autowired
	protected UserRepository userRepository;

	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = Optional.ofNullable(userRepository.findOneByUser_name(username)).orElseThrow(()-> new UsernameNotFoundException("user not found."));
		return new AccountUserDetails(user, this.getAuthorities(user));
	}
	
	private Collection<GrantedAuthority> getAuthorities(User user){
		return AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
	}
}
