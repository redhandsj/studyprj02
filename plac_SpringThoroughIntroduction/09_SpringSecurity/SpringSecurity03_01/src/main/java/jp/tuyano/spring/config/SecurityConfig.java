package jp.tuyano.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("mkyong").password("123456").roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");
	}

	/**
	 * 「Security Filterのリスト作成
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/login").permitAll().anyRequest().authenticated()
			.antMatchers("/", "/home").permitAll() 
			.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/db/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
			// ログインフォーム指定の設定
			.and().formLogin()
					.loginPage("/login").permitAll()
					.loginProcessingUrl("/login")
					.usernameParameter("username").passwordParameter("password").permitAll()
//					// 認証成功／失敗時のアクセス
					.successForwardUrl("/admin").permitAll()
					.failureUrl("/loginFailure").permitAll()
			.and().exceptionHandling().accessDeniedPage("/Access_Denied");
		
	}
}