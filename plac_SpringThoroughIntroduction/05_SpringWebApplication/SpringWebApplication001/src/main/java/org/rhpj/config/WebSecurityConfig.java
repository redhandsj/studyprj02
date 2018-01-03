package org.rhpj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
// メソッド呼び出しに対する認可処理を行なうAOPが有効になる
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

// 	@Autowired(required = false)
// 	@Autowired
// 	UserDetailsService userDetailsService;

	@Override
	public void configure(WebSecurity web) {
		// セキュリティ対策が不要なリソース
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// フォーム認証で使用するコンポーネントの動作をカスタマイズするためのメソッ ドが定義されている
		//http.formLogin();
		// ログインページにアクセス権限を与える
		http.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/")
			//.failureUrl("/loginFailure")
			.permitAll();
		// ログアウト処理の適用
		http.logout()
		    .logoutSuccessUrl("/logoutSuccess")
		    .permitAll();
		// Webリソースへの認可(9.5.3)
		// 設定順にマッチングを行う為、記述順に気を付ける
		http.authorizeRequests()
		    // ★ ロール
	        .antMatchers("/admin/accounts/**").hasRole("ACCOUNT_MANAGER")
	        .antMatchers("/admin/**").hasRole("ADMIN")
		    // ★ アドレス＆ロール
	        .antMatchers("/admin/configurations/**")
	            .access("hasIpAddress('127.0.0.1') and hasRole('CONFIGURATION_MANAGER')")
	        // ★ ロール＆ユーザ名認証
	        .antMatchers("/users/{username}")
	            .access("isAuthenticated() and (hasRole('ADMIN') or (#username == principal.username))") 
		    .anyRequest().authenticated();

		// 認可エラー時の遷移先
		// - デフォルトの設定だと、認証済みのユーザーからのアクセスを拒否した際に、アプリケー ションサーバーのエラーページが表示
		http.exceptionHandling()
		    .accessDeniedPage("/WEB-INF/views/accessDeniedError.jsp");

		// セッション管理機能 ON
		http.sessionManagement();
		    // 無効なセッションを検知した際の遷移先として"/error/invalidSession"を指定
            //.invalidSessionUrl("/error/invalidSession");
		    // セッション固定攻撃への対策のオプション
		    //   ⇒ セッションIDを変更するが、ログイン前に格納されていたオブジェク トは新しいセッションに引き継がれない 
		    // .sessionFixation().newSession();
		    // セッションを使用しない場合
		    //.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		// デフォルト動作のカスタマイズ
		// 認可エラー時のレスポンスのカスタマイズポイントとして、AuthenticationEntryPointとAccessDenied Handlerの差し替え
//		http.exceptionHandling()
//		    .authenticationEntryPoint(authenticationEntryPoint())
//		    .accessDeniedHandler(accessDeniedHandler());
		// デフォルトでは有効となっている
		//http.csrf().disable();  // disableメソッドを呼び出し無効化
		//http.headers().disable();  // disableメソッドを呼び出し無効化 
		
        // セキュリティヘッダ		
//		http.headers()
//            .defaultsDisabled()
//            .cacheControl().and()
//            .frameOptions().and()
//            .contentTypeOptions().and()
//            .xssProtection();
		
	}

//	@Autowired
//	void configureAuthenticationManager(AuthenticationManagerBuilder auth) throws Exception { 
//		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//	}
//
//	@Bean
//	PasswordEncoder passwordEncoder(){ 
//		return new BCryptPasswordEncoder();
//	}

	 @Autowired
	 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		 // sets up an in-memory user store with a single user.
		 auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER"); 
	 }
}
