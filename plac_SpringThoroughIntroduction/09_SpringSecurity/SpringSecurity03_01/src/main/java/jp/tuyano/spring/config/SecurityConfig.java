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

//		http.authorizeRequests()
//		// 未ログインでもアクセス可能なパス
//		.antMatchers("/login").permitAll() 
//		// ログインしないとアクセスできない
//		.antMatchers("/", "/home").hasAnyRole("ADMIN","DBA","USER")
////		// 「ROLE_ADMIN」権限でログインしないとアクセスできない
////		.antMatchers("/admin").hasRole("ADMIN")
////		// 「ROLE_ADMIN」OR「ROLE_DBA」権限でログインしないとアクセスできない
////		.antMatchers("/db").hasAnyRole("ADMIN","DBA")
//		// 全てのURLリクエストは認証されているユーザーしかアクセスできないという記述
//		.anyRequest().authenticated()
//		// ログインフォーム指定の設定
//		.and().formLogin()
//			// ログイン画面のURL
//			.loginPage("/login")
//			// ログインを行う処理
//			.loginProcessingUrl("/authentication")
//			// 処理に渡すパラメータ
//			.usernameParameter("username").passwordParameter("password")
////			// 認証成功／失敗時のアクセス
//			// true : ログイン画面した後必ずtopにとばされる
//			// false : (認証されてなくて一度ログイン画面に飛ばされても)ログインしたら指定したURLに飛んでくれる
//			.defaultSuccessUrl("/home",true).permitAll()
////			.successForwardUrl("/admin").permitAll()
//			// 認証失敗時のアクセス
////			.failureUrl("/loginFailure").permitAll()
//		// 認可エラーの場合の遷移先
////		.and().exceptionHandling().accessDeniedPage("/Access_Denied")
//		// セッション固定攻撃対策
//		.and().sessionManagement()
//			// ログイン後に新しいセッションにする
//			.sessionFixation().newSession()
//			// 無効なセッションを検知した後の遷移先
//			.invalidSessionUrl("/error/invalidSession")
//		// セキュリティヘッダの選択
//		.and().headers()
//			// デフォルトで適用されるヘッダー出力を行う
//			.defaultsDisabled()
//			// Cache-Control(Pragma, Expires)ヘッダを出力するコンポーネントを登録
//			.cacheControl().and()
//			//  X-Frame-Optionsヘッダーを出力するコンポーネントを登録
//			.frameOptions().and()
//			// X-Content-Type-Optionsヘッダーを出力するコンポーネントを登録
//			.contentTypeOptions().and()
//			// X-XSS-Protectionヘッダーを出力するコンポーネントを登録
//			.xssProtection()
//		;

		
	}
}